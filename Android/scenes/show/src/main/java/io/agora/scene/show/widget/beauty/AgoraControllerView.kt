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
                        R.string.show_beauty_item_beauty_overall,
                        R.mipmap.show_beauty_ic_face_shoulian,
                        beautyConfig.thinFace.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.thinFace = value.toInt()
                        },
                        valueRange =  0f..100f
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_beauty_cheekbone,
                        R.mipmap.show_beauty_ic_face_shouquangu,
                        beautyConfig.shrinkCheekbone.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.shrinkCheekbone = value.toInt()
                        },
                        valueRange =  0f..100f
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
                        R.string.show_beauty_item_beauty_nose,
                        R.mipmap.show_beauty_ic_face_shoubi,
                        beautyConfig.narrowNose.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.narrowNose = value.toInt()
                        },
                        valueRange = 0f..100f
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
                        R.string.show_beauty_item_beauty_jawbone,
                        R.mipmap.show_beauty_ic_face_xiahegu,
                        beautyConfig.shrinkJawbone.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.shrinkJawbone = value.toInt()
                        },
                        valueRange =  0f..100f
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
                        R.string.show_beauty_item_beauty_mouth,
                        R.mipmap.show_beauty_ic_face_zuixing,
                        beautyConfig.mouthSize.toFloat(),
                        onValueChanged = { value ->
                            beautyConfig.mouthSize = value.toInt()
                        },
                        valueRange = -100f..100f
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
                        R.string.show_beauty_item_beauty_bright_eye,
                        R.mipmap.show_beauty_ic_face_bright_eye,
                        beautyConfig.brighten_eye,
                        onValueChanged = { value ->
                            beautyConfig.brighten_eye = value
                        }
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
                        R.string.show_beauty_item_beauty_remove_dark_circles,
                        R.mipmap.show_beauty_ic_face_remove_dark_circles,
                        beautyConfig.eye_pouch,
                        onValueChanged = { value ->
                            beautyConfig.eye_pouch = value
                        }
                    ),
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
                        R.string.show_beauty_item_filter_yuansheng,
                        R.mipmap.show_beauty_ic_filter_yuansheng,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "原生",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "原生"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_nenbai,
                        R.mipmap.show_beauty_ic_filter_nenbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "嫩白",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "嫩白"
                            beautyConfig.filterStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_filter_lengbai,
                        R.mipmap.show_beauty_ic_filter_lengbai,
                        withPadding = false,
                        isSelected = beautyConfig.filterName == "冷白",
                        value = beautyConfig.filterStrength,
                        onValueChanged = { value ->
                            beautyConfig.filter = true
                            beautyConfig.filterName = "冷白"
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
                            beautyConfig.sharpen = 0.0f
                        },
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_adjust_sharpen,
                        R.mipmap.show_beauty_ic_adjust_sharp,
                        beautyConfig.sharpen,
                        onValueChanged = { value ->
                            beautyConfig.sharpen = value
                        }
                    ),
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
                        R.string.show_beauty_item_sticker_sdlu,
                        R.mipmap.show_beauty_ic_sticker_elk,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "鹿",
                        value = beautyConfig.stickerStrength,
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "鹿"
                            beautyConfig.stickerStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker_zhaocaimao,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "招财猫",
                        value = beautyConfig.stickerStrength,
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "招财猫"
                            beautyConfig.stickerStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker_qianjing,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "前景",
                        value = beautyConfig.stickerStrength,
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "前景"
                            beautyConfig.stickerStrength = value
                        }
                    ),
                    ItemInfo(
                        R.string.show_beauty_item_sticker_guofeng,
                        R.mipmap.show_beauty_ic_sticer_zhaocaimao,
                        withPadding = false,
                        isSelected = beautyConfig.stickerName == "国风",
                        value = beautyConfig.stickerStrength,
                        onValueChanged = { value ->
                            beautyConfig.sticker = true
                            beautyConfig.stickerName = "国风"
                            beautyConfig.stickerStrength = value
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
            || pageInfo.name == R.string.show_beauty_group_adjust
        ) {
            viewBinding.slider.visibility = View.VISIBLE
            viewBinding.ivCompare.isVisible = true
        }
    }

}