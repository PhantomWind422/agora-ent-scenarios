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
                        R.string.show_beauty_item_none,
                        R.mipmap.show_beauty_ic_none,
                        onValueChanged = { _ ->
                            beautyConfig.beautyName = null
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_normal,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        isSelected = beautyConfig.beautyName == "基础模板",
                        onValueChanged = { _ ->
                            beautyConfig.beautyName = "基础模板"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_show,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        isSelected = beautyConfig.beautyName == "秀场模板",
                        onValueChanged = { _ ->
                            beautyConfig.beautyName = "秀场模板"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_baitu,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        isSelected = beautyConfig.beautyName == "白兔模板",
                        onValueChanged = { _ ->
                            beautyConfig.beautyName = "白兔模板"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_faceshape_female,
                        R.mipmap.show_beauty_ic_effect_tianmei,
                        beautyConfig.femaleStyle.toFloat(),
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
                        beautyConfig.thinFace.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.thinFace = value.toInt()
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
                        R.string.show_beauty_item_beauty_xiahexian,
                        R.mipmap.show_beauty_ic_face_xiahegu,
                        beautyConfig.shrinkCheek.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.shrinkCheek = value.toInt()
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
                        R.string.show_beauty_item_effect_xuejie,
                        R.mipmap.show_beauty_ic_effect_hunxue,
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
                        R.string.show_beauty_item_effect_baitu2,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "白兔妆",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "白兔妆"
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
                        R.string.show_beauty_item_filter_nuanhuang,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "暖黄",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "暖黄"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_landiaojiaopian,
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
                        R.string.show_beauty_item_filter_mitao,
                        R.mipmap.show_beauty_ic_filter_lengbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "蜜桃",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "蜜桃"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_heijin,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "黑金",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "黑金"
                            beautyConfig.filterStrength = value
                        }
                    )
                )
            ),
            PageInfo(
                R.string.show_beauty_group_adjust,
                listOf(
                    ItemInfo(
                        R.string.show_beauty_item_none,
                        R.mipmap.show_beauty_ic_none,
                        0.0f,
                        isSelected = true,
                        onValueChanged = { _ ->
                            beautyConfig.redness = 0.0f
                            beautyConfig.hue = 0.0f
                            beautyConfig.saturation = 0.0f
                            beautyConfig.brightness = 0.0f
                        },
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_redden,
                        R.mipmap.show_beauty_ic_face_redden,
                        beautyConfig.sharpen,
                        onValueChanged = { value ->
                            beautyConfig.redness = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_hue,
                        R.mipmap.show_beauty_ic_adjust_clear,
                        beautyConfig.hue,
                        onValueChanged = { value ->
                            beautyConfig.hue = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_adjust_saturation,
                        R.mipmap.show_beauty_ic_adjust_saturation,
                        beautyConfig.saturation,
                        onValueChanged = { value ->
                            beautyConfig.saturation = value
                        }
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
                        R.string.show_beauty_item_sticker13,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "兔子耳朵",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "兔子耳朵"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker15,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "小熊眼罩",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "小熊眼罩"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker16,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "招财猫",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "招财猫"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker16,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "国风",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "国风"
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