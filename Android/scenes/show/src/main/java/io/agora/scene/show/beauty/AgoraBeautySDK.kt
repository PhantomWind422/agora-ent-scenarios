package io.agora.scene.show.beauty

import android.content.Context
import io.agora.rtc2.Constants
import io.agora.rtc2.RtcEngine
import io.agora.rtc2.video.BeautyOptions
import io.agora.rtc2.video.FaceShapeAreaOptions
import io.agora.rtc2.video.FaceShapeBeautyOptions
import io.agora.rtc2.video.FilterEffectOptions
import io.agora.rtc2.video.MakeUpOptions
import io.agora.rtc2.IVideoEffectObject
import io.agora.scene.show.ShowLogger
import io.agora.scene.show.utils.FileUtils
import org.json.JSONException
import org.json.JSONObject

object AgoraBeautySDK {
    private const val TAG = "AgoraBeautySDK"
    private var rtcEngine: RtcEngine? = null
    private var beautyEffect: IVideoEffectObject? = null
    private var beautyEnable = false
    private var filterEnable = false
    private var makeupEnable = false
    private var stickerEnable = false
    private const val assetsPath = "beauty_agora"
    private var materialPath = ""
    private var materialCopied = false

    // 美颜配置
    val beautyConfig = BeautyConfig()

    fun initBeautySDK(context: Context, rtcEngine: RtcEngine): Boolean {
        var storagePath = context.getExternalFilesDir("")?.absolutePath ?: return false
        if (!materialCopied) {
            var destPath = "$storagePath/beauty_agora"
            FileUtils.copyAssets(context, "${assetsPath}", destPath)
            materialCopied = true
        }
        materialPath = "$storagePath/beauty_agora/beauty_material_functional"

        this.rtcEngine = rtcEngine
        val ret = rtcEngine.enableExtension(
            "agora_video_filters_clear_vision",
            "clear_vision",
            true,
            Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE
        )
        if (ret != Constants.ERR_OK) {
            ShowLogger.d(TAG, "enableExtension failed: errorMsg:${RtcEngine.getErrorDescription(ret)},errorCode:$ret")
            return false
        }
        // The private parameter is not supported, use VideoFrameObserver#getMirrorApplied instead
        // rtcEngine.setParameters("{\"rtc.camera_capture_mirror_mode\":0}")

        beautyEffect = this.rtcEngine?.createVideoEffectObject(materialPath, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
        beautyConfig.resume()
        return true
    }

    fun unInitBeautySDK() {
        enable(false)
        rtcEngine?.destroyVideoEffectObject(beautyEffect)
        rtcEngine?.enableExtension(
            "agora_video_filters_clear_vision",
            "clear_vision",
            false,
            Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE
        )
        // The private parameter is not supported, use VideoFrameObserver#getMirrorApplied instead
        // rtcEngine?.setParameters("{\"rtc.camera_capture_mirror_mode\":2}")
        rtcEngine = null
        beautyEffect = null
        beautyEnable = false
        filterEnable = false
        makeupEnable = false
        stickerEnable = false
    }

    fun enable(enable: Boolean) {
        if (enable) {
            enableBeauty(true)
            enableFilter(true)
            enableMakeup(true)
            enableSticker(true)
        } else {
            enableBeauty(false)
            enableFilter(false)
            enableMakeup(false)
            enableSticker(false)
        }
    }

    private fun enableBeauty(enable: Boolean) {
        val effect = beautyEffect ?: return
        if (enable == beautyEnable) return
        if (enable) {
            if (beautyConfig.beautyName != null) {
                effect.addOrUpdateVideoEffect(
                    IVideoEffectObject.VIDEO_EFFECT_NODE_ID.BEAUTY.value,
                    beautyConfig.beautyName
                )
            }
        } else {
            effect.removeVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.BEAUTY.value)
        }
        this.beautyEnable = enable
    }

    private fun enableFilter(enable: Boolean) {
        val effect = beautyEffect ?: return
        if (enable == filterEnable) return
        if (enable) {
            if (beautyConfig.filterName != null) {
                effect.addOrUpdateVideoEffect(
                    IVideoEffectObject.VIDEO_EFFECT_NODE_ID.FILTER.value,
                    beautyConfig.filterName
                )
            }
        } else {
            effect.removeVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.FILTER.value)
        }
        this.filterEnable = enable
    }

    private fun enableMakeup(enable: Boolean) {
        val effect = beautyEffect ?: return
        if (enable == makeupEnable) return
        if (enable) {
            if(beautyConfig.makeupName != null) {
                effect.addOrUpdateVideoEffect(
                    IVideoEffectObject.VIDEO_EFFECT_NODE_ID.STYLE_MAKEUP.value,
                    beautyConfig.makeupName
                )
            }
        } else {
            effect.removeVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.STYLE_MAKEUP.value)
        }
        this.makeupEnable = enable
    }

    private fun enableSticker(enable: Boolean) {
        val effect = beautyEffect ?: return
        if (enable == stickerEnable) return
        if (enable) {
            if(beautyConfig.stickerName != null) {
                effect.addOrUpdateVideoEffect(
                    IVideoEffectObject.VIDEO_EFFECT_NODE_ID.STICKER.value,
                    beautyConfig.stickerName
                )
            }
        } else {
            effect.removeVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.STICKER.value)
        }
        this.stickerEnable = enable
    }

    class BeautyConfig {
        var beauty: Boolean = false
            set(value) {
                field = value
                enableBeauty(value)
            }

        // 美颜模板，空字符串表示素材默认
        var beautyName: String? = ""
            set(value) {
                if (field == value) {
                    return
                }
                field = value
                beautyEffect?.addOrUpdateVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.BEAUTY.value, value)
            }

        // 磨皮程度，取值范围为 [0.0,1.0]，其中 0.0 表示原始磨皮程度，默认值为 0.5。取值越大，磨皮程度越大。
        var smooth: Float = 0.35f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "smoothness", value)
            }

        // 美白程度，取值范围为 [0.0,1.0]，其中 0.0 表示原始亮度，默认值为 0.6。取值越大，美白程度越大。
        var whiten: Float = 0.25f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "lightness", value)
            }

        // 锐化程度，取值范围为 [0.0,1.0]，其中 0.0 表示原始锐度，默认值为 0.3。取值越大，锐化程度越大。
        var sharpen: Float = 0.15f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "sharpness", value)
            }

        var clarity: Float = 0.2f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "contrast_strength", value)
            }

        var redness: Float = 0.2f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "redness", value)
            }

        var hue: Float = 0.0f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "redness", value)
            }

        var saturation: Float = 0.0f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "saturation", value)
            }

        var brightness: Float = 0.0f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("beauty_effect_option", "brightness", value)
            }

        var whiten_teeth: Float = 0.35f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("face_buffing_option", "whiten_teeth", value)
            }

        var brighten_eye: Float = 0.4f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("face_buffing_option", "brighten_eye", value)
            }

        var nasolabial_folds: Float = 0.35f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("face_buffing_option", "nasolabial_fold", value)
            }

        var eye_pouch: Float = 0.3f
            set(value) {
                field = value
                enableBeauty(true)
                beautyEffect?.setVideoEffectFloatParam("face_buffing_option", "eye_pouch", value)
            }

        var filter: Boolean = false
            set(value) {
                field = value
                enableFilter(value)
            }

        // 滤镜模板，空字符串表示素材默认
        var filterName: String? = null
            set(value) {
                if (field == value) {
                    return
                }
                field = value
                beautyEffect?.addOrUpdateVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.FILTER.value, value)
            }

        var filterStrength: Float = 0.5f
            set(value) {
                field = value
                beautyEffect?.setVideoEffectFloatParam("filter_effect_option", "strength", value)
            }

        // 大眼 对应修饰力度范围为 [0,100]，值越大，眼睛越大，预设值为 53。
        var enlargeEye = 30
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYESCALE, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var eyePosition = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEPOSITION, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var eyeDistance = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEDISTANCE, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var eyeInnerCorner = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEINNERCORNER, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var eyeOuterCorner = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEOUTERCORNER, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 下巴 对应修饰力度范围为 [-100,100]，正值为拉长，负值为变短，绝对值越大修饰效果越强，预设值为 -20。
        var chinLength = 15
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_CHIN, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 瘦脸 对应修饰力度范围为 [0,100]，值越大瘦脸效果越强，预设值为 10。
        var thinFace = 40
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_FACECONTOUR, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var headScale = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_HEADSCALE, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 瘦颧骨 对应修饰力度范围为 [0,100]，值越大颧骨越窄，预设值为 43。
        var shrinkCheekbone = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_CHEEKBONE, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var faceWidth = 10
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_FACEWIDTH, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var shrinkCheek = 30
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_CHEEK, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 瘦鼻 对应修饰力度范围为 [-100,100]，正值为变宽，负值为变窄，绝对值越大修饰效果越强，预设值为 72。
        var narrowNose = 15
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_NOSEWIDTH, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var noseLength = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_NOSELENGTH, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 嘴型 对应修饰力度范围为 [-100,100]，正值为变大，负值为变小，绝对值越大修饰效果越强，预设值为 20。
        var mouthSize = 15
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHSCALE, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var mouthPosition = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var mouthSmile = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHSMILE, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 下颌骨 对应修饰力度范围为 [0,100]，值越大脸颊越窄，预设值为 50。
        var shrinkJawbone = 0
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_CHEEK, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        // 发际线 对应修饰力度范围为 [-100,100]，正值为调高，负值为调低，绝对值越大修饰效果越强，预设值为 50。
        var hairlineHeight = 50
            set(value) {
                field = value
                val areaOption = FaceShapeAreaOptions(FaceShapeAreaOptions.FACE_SHAPE_AREA_FOREHEAD, value);
                rtcEngine?.setFaceShapeAreaOptions(areaOption)
            }

        var stylemakeup: Boolean = false
            set(value) {
                field = value
                enableMakeup(value)
            }

        // 美妆素材
        var makeupName: String? = null
            set(value) {
                if (field == value) {
                    return
                }
                field = value
                beautyEffect?.addOrUpdateVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.STYLE_MAKEUP.value, value)
            }

        // 美妆强度
        var makeupStrength: Float = 0.95f
            set(value) {
                field = value
                beautyEffect?.setVideoEffectFloatParam("style_makeup_option", "styleIntensity", value)
            }

        var sticker: Boolean = false
            set(value) {
                field = value
                enableSticker(value)
            }

        // 贴纸素材
        var stickerName: String? = null
            set(value) {
                if (field == value) {
                    return
                }
                field = value
                beautyEffect?.addOrUpdateVideoEffect(IVideoEffectObject.VIDEO_EFFECT_NODE_ID.STICKER.value, value)
            }

        internal fun reset() {
            beautyName = null
            beautyName = ""
            filterName = null
            makeupName = null
            stickerName = null
        }

        internal fun resume() {
            beautyName = beautyName
            filterName = filterName
            makeupName = makeupName
            stickerName = stickerName
        }
    }
}