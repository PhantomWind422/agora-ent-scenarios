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
                            beautyConfig.beauty = false
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_smooth,
                        R.mipmap.show_beauty_ic_face_mopi,
                        beautyConfig.smooth,
                        isSelected = true,
                        onValueChanged = { value ->
                            beautyConfig.smooth = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_whiten,
                        R.mipmap.show_beauty_ic_face_meibai,
                        beautyConfig.whiten,
                        onValueChanged = { value ->
                            beautyConfig.whiten = value
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
                        R.string.show_beauty_item_beauty_eye_innercorner,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyeInnerCorner.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyeInnerCorner = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_eye_outercorner,
                        R.mipmap.show_beauty_ic_face_eye,
                        beautyConfig.eyeOuterCorner.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.eyeOuterCorner = value.toInt()
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
                        R.string.show_beauty_item_effect_hunxue,
                        R.mipmap.show_beauty_ic_effect_hunxue,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "学姐",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "学姐妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_effect_oumei,
                        R.mipmap.show_beauty_ic_effect_oumei,
                        withPadding = false,
                        isSelected = beautyConfig.makeupName == "学妹",
                        value = beautyConfig.makeupStrength,
                        onValueChanged = { value ->
                            beautyConfig.stylemakeup = true
                            beautyConfig.makeupName = "学妹妆"
                            beautyConfig.makeupStrength = value
                        }
                    ),
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
                        R.string.show_beauty_item_filter_CT,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "CT",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "CT"
                            beautyConfig.filterStrength = value
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
                        R.string.show_beauty_item_filter_lvtu,
                        R.mipmap.show_beauty_ic_filter_lengbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "旅途",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "旅途"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_meishijiaopian,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "美式胶片",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "美式胶片"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_landiaojiaopian,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "蓝调胶片",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "蓝调胶片"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_rizha,
                        R.mipmap.show_beauty_ic_filter_lengbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "日杂",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "日杂"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_jindu,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "京都",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "京都"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_aizhicheng,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "爱之城",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "爱之城"
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
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_luolita,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "洛丽塔",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "洛丽塔"
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
                        R.string.show_beauty_item_sticker1,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "2周年庆",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "2周年庆"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker2,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "3周年庆",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "3周年庆"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker3,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "爱心",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "爱心"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker4,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "哈芝节",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "哈芝节"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker5,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "蝴蝶结",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "蝴蝶结"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker6,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "花海口罩",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "花海口罩"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker7,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "滑雪镜",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "滑雪镜"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker8,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "猫猫眼",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "猫猫眼"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker9,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "前景测试",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "前景测试"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker10,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "世界杯",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "世界杯"

                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker11,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "屠妖节",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "屠妖节"
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker12,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "兔耳朵",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "兔耳朵"

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
                        R.string.show_beauty_item_sticker14,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "兔子眼罩",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "兔子眼罩"

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
                        isSelected = beautyConfig.stickerName == "新年快乐",
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "新年快乐"
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