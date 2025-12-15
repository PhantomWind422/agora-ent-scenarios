package io.agora.scene.show.widget.beauty

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.core.view.isVisible
import io.agora.scene.show.R
import io.agora.scene.show.beauty.AgoraBeautySDK
import io.agora.scene.show.beauty.FaceUnityBeautySDK

class AgoraControllerView : BaseControllerView {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onPageListCreate(): List<PageInfo> {
        val beautyConfig = AgoraBeautySDK.beautyConfig
        return listOf(
            PageInfo(
                R.string.show_beauty_group_beauty,
                listOf(
                    ItemInfo(
                        R.string.show_beauty_item_faceshape_female,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        beautyConfig.femaleStyle.toFloat(),
                        isSelected = true,
                        onValueChanged = { value ->
                            beautyConfig.femaleStyle = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_faceshape_male,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        beautyConfig.maleStyle.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.maleStyle = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_faceshape_natural,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        beautyConfig.naturalStyle.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.naturalStyle = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_smooth,
                        R.mipmap.show_beauty_ic_face_mopi,
                        beautyConfig.smooth,
                        onValueChanged = { value ->
                            beautyConfig.smooth = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_whiten,
                        R.mipmap.show_beauty_ic_face_meibai,
                        beautyConfig.whitenNatural,
                        onValueChanged = { value ->
                            beautyConfig.whitenNatural = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_whiten_cold,
                        R.mipmap.show_beauty_ic_face_meibai,
                        beautyConfig.whitenCold,
                        onValueChanged = { value ->
                            beautyConfig.whitenCold = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_whiten_pink,
                        R.mipmap.show_beauty_ic_face_meibai,
                        beautyConfig.whitenPink,
                        onValueChanged = { value ->
                            beautyConfig.whitenPink = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_whiten_super,
                        R.mipmap.show_beauty_ic_face_meibai,
                        beautyConfig.whitenSuper,
                        onValueChanged = { value ->
                            beautyConfig.whitenSuper = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_adjust_sharpen,
                        R.mipmap.show_beauty_ic_adjust_sharp,
                        beautyConfig.sharpen,
                        onValueChanged = { value ->
                            beautyConfig.sharpen = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_adjust_clarity,
                        R.mipmap.show_beauty_ic_adjust_contrast,
                        beautyConfig.clarity,
                        onValueChanged = { value ->
                            beautyConfig.clarity = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_overall,
                        R.mipmap.show_beauty_ic_face_shoulian,
                        beautyConfig.faceContour.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.faceContour = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_face_headscale,
                        R.mipmap.show_beauty_ic_face_shoulian,
                        beautyConfig.headScale.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.headScale = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_narrowface,
                        R.mipmap.show_beauty_ic_face_shoulian,
                        beautyConfig.faceWidth.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.faceWidth = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_longface,
                        R.mipmap.show_beauty_ic_face_shoulian,
                        beautyConfig.faceLength.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.faceLength = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_cheekbone,
                        R.mipmap.show_beauty_ic_face_xiahegu,
                        beautyConfig.cheekbone.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.cheekbone = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_xiahexian,
                        R.mipmap.show_beauty_ic_face_xiahegu,
                        beautyConfig.shrinkCheek.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.shrinkCheek = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_mandible,
                        R.mipmap.show_beauty_ic_face_xiahegu,
                        beautyConfig.mandible.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.mandible = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_chin,
                        R.mipmap.show_beauty_ic_face_xiaba,
                        beautyConfig.chinLength.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.chinLength = value.toInt()
                        },
                        valueRange = -100f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_fajixian,
                        R.mipmap.show_beauty_ic_face_etou,
                        beautyConfig.hairlineHeight.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.hairlineHeight = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_remove_nasolabial_folds,
                        R.mipmap.show_beauty_ic_face_remove_nasolabial_folds,
                        beautyConfig.nasolabial_folds,
                        onValueChanged = { value ->
                            beautyConfig.nasolabial_folds = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.enlargeEye.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.enlargeEye = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye_position,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyePosition.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyePosition = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye_distance,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyeDistance.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyeDistance = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye_pupil,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyePupil.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyePupil = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eyelid,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyeLid.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyeLid = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye_innercorner,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyeInnercorner.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyeInnercorner = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye_outercorner,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyeOutercorner.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyeOutercorner = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_bright_eye,
                        R.mipmap.show_beauty_ic_face_bright_eye,
                        beautyConfig.brighten_eye,
                        onValueChanged = { value ->
                            beautyConfig.brighten_eye = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_remove_dark_circles,
                        R.mipmap.show_beauty_ic_face_remove_dark_circles,
                        beautyConfig.eye_pouch,
                        onValueChanged = { value ->
                            beautyConfig.eye_pouch = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_nose,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.narrowNose.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.narrowNose = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_long_nose,
                        R.mipmap.show_beauty_ic_face_changbi,
                        beautyConfig.noseLength.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.noseLength = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_nose_wing,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.noseWing.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.noseWing = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_nose_bridge,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.noseBridge.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.noseBridge = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_nose_root,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.noseRoot.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.noseRoot = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_nose_tip,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.noseTip.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.noseTip = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_nose_general,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.noseGeneral.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.noseGeneral = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_mouth,
                        R.mipmap.show_beauty_ic_face_zuixing,
                        beautyConfig.mouthSize.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.mouthSize = value.toInt()
                        },
                        valueRange = -100f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_mouth_position,
                        R.mipmap.show_beauty_ic_face_zuixing,
                        beautyConfig.mouthPosition.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.mouthPosition = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_mouth_smile,
                        R.mipmap.show_beauty_ic_face_zuixing,
                        beautyConfig.mouthSmile.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.mouthSmile = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_mouth_lip,
                        R.mipmap.show_beauty_ic_face_zuixing,
                        beautyConfig.mouthLip.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.mouthLip = value.toInt()
                        },
                        valueRange = 0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_teeth,
                        R.mipmap.show_beauty_ic_face_meiya,
                        beautyConfig.whiten_teeth,
                        onValueChanged = { value ->
                            beautyConfig.whiten_teeth = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eyebrow_position,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyebrowPosition.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyebrowPosition = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eyebrow_thickness,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyebrowThickness.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyebrowThickness = value.toInt()
                        },
                        valueRange =  0f..100f
                    )
                )
            ),
            PageInfo(
                R.string.show_beauty_group_effect,
                listOf(
                    ItemInfo(
                        R.string.show_beauty_item_none,
                        R.mipmap.show_beauty_ic_none,
                        isSelected = !beautyConfig.stylemakeup,
                        onValueChanged = { _ ->
                            beautyConfig.stylemakeup = false
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_baixi,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "白皙妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "白皙妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_fenyun,
                        R.mipmap.show_beauty_ic_effect_hunxue,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "粉晕妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "粉晕妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_qiaopi,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "俏皮妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "俏皮妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_qizhi,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "气质妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "气质妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_shaonv,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "少女妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "少女妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_shenshui,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "深邃妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "深邃妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_xuejie,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "学姐妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "学姐妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_xuemei,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "学妹妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "学妹妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_yinyun,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "氤氲妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "氤氲妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_youya,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "优雅妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "优雅妆"
                            beautyConfig.makeupStrength = value
                        }
                    )
                )
            ),
            PageInfo(
                R.string.show_beauty_group_filter,
                listOf(
                    ItemInfo(
                        R.string.show_beauty_item_none,
                        R.mipmap.show_beauty_ic_none,
                        isSelected = !beautyConfig.filter,
                        onValueChanged = { _ ->
                            beautyConfig.filter = false
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_baitao,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "白桃",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "白桃"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_jiaopian,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "胶片",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "胶片"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_mianrong,
                        R.mipmap.show_beauty_ic_filter_lengbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "棉绒",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "棉绒"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_manhua,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "漫画",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "漫画"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_liuguang,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "流光",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "流光"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_ins,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "ins风",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "ins风"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_jiaotang,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "焦糖",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "焦糖"
                            beautyConfig.filterStrength = value
                        }
                    )
                )
            ),
            PageInfo(
                R.string.show_beauty_group_adjust,
                listOf(
                    ItemInfo(
                        R.string.show_beauty_item_beauty_redden,
                        R.mipmap.show_beauty_ic_face_redden,
                        beautyConfig.redness,
                        onValueChanged = { value ->
                            beautyConfig.redness = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_temp,
                        R.mipmap.show_beauty_ic_adjust_clear,
                        beautyConfig.temperature,
                        onValueChanged = { value ->
                            beautyConfig.temperature = value
                        },
                        valueRange = -1.0f..1.0f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_hue,
                        R.mipmap.show_beauty_ic_adjust_clear,
                        beautyConfig.hue,
                        onValueChanged = { value ->
                            beautyConfig.hue = value
                        },
                        valueRange = -1.0f..1.0f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_adjust_saturation,
                        R.mipmap.show_beauty_ic_adjust_saturation,
                        beautyConfig.saturation,
                        onValueChanged = { value ->
                            beautyConfig.saturation = value
                        },
                        valueRange = -1.0f..1.0f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_brightness,
                        R.mipmap.show_beauty_ic_adjust_clear,
                        beautyConfig.brightness,
                        onValueChanged = { value ->
                            beautyConfig.brightness = value
                        }
                    )
                )
            ),
            PageInfo(
                R.string.show_beauty_group_sticker,
                listOf(
                    ItemInfo(
                        R.string.show_beauty_item_none,
                        R.mipmap.show_beauty_ic_none,
                        isSelected = !beautyConfig.sticker,
                        onValueChanged = { _ ->
                            beautyConfig.sticker = false
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker1,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "圣诞节",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "圣诞节"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker2,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "章鱼",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "章鱼"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker3,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "猪可爱",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "猪可爱"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker4,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "辫子猫",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "辫子猫"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker5,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "粉色发箍",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "粉色发箍"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker6,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "没有烦恼",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "没有烦恼"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker7,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "卡通猫",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "卡通猫"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker8,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "蝴蝶",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "蝴蝶"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker9,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "粉刷时光",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "粉刷时光"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker10,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "赛博眼镜",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "赛博眼镜"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker11,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "霓虹皇冠",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "霓虹皇冠"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker12,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "爱心眼镜",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "爱心眼镜"
                        }
                    )
                )
            )
        )
    }

    override fun onSelectedChanged(pageIndex: Int, itemIndex: Int) {
        super.onSelectedChanged(pageIndex, itemIndex)
        val pageInfo = pageList[pageIndex]
        val itemInfo = pageInfo.itemList[itemIndex]
        if (itemInfo.name == R.string.show_beauty_item_none) {
            viewBinding.slider.visibility = View.INVISIBLE
            viewBinding.ivCompare.isVisible = false
        } else if (pageInfo.name == R.string.show_beauty_group_beauty
            || pageInfo.name == R.string.show_beauty_group_effect
            || pageInfo.name == R.string.show_beauty_group_filter
            || pageInfo.name == R.string.show_beauty_group_adjust
            || pageInfo.name == R.string.show_beauty_group_sticker
        ) {
            viewBinding.slider.visibility = View.VISIBLE
            viewBinding.ivCompare.isVisible = true
        }
    }

}