//
//  BeautyModel+Agora.swift
//  AgoraEntScenarios
//
//  Created by zhaoyongqiang on 2023/11/10.
//

import Foundation

extension BeautyModel {
    static func createAgoraBeautyData() -> [BeautyModel] {
        var dataArray = [BeautyModel]()
        var model = BeautyModel()
        model.name = "show_beauty_item_none".show_localized
        model.icon = "show_beauty_none"
        model.isSelected = true
        dataArray.append(model)
        
        // template
        model = BeautyModel()
        model.path = ""
        model.key = "templateBeauty1"
        model.value = 0
        model.name = "模板-通用"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "templateBeauty2"
        model.value = 0
        model.name = "模板-素人"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "templateBeauty3"
        model.value = 0
        model.name = "模板-主播"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "templateBeauty4"
        model.value = 0
        model.name = "模板-秀场"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "templateBeauty5"
        model.value = 0
        model.name = "模板-带妆"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "fsstyleFemale"
        model.value = 0.0
        model.name = "美型-女"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "fsstyleMale"
        model.value = 0.0
        model.name = "美型-男"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "fsstyleNatural"
        model.value = 0.0
        model.name = "美型-自然"
        model.icon = "meiyan_fgz_tianmei"
        dataArray.append(model)
        
        // smoothness
        model = BeautyModel()
        model.path = ""
        model.key = "smoothnessLevel"
        model.value = 0.35
        model.name = "show_beauty_item_beauty_smooth".show_localized
        model.icon = "meiyan_icon_mopi"
        dataArray.append(model)
        
        // whiten
        model = BeautyModel()
        model.path = ""
        model.key = "whitenNatural"
        model.value = 0.25
        model.name = "自然白"
        model.icon = "meiyan_icon_meibai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "whitenCold"
        model.value = 0.25
        model.name = "冷白"
        model.icon = "meiyan_icon_meibai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "whitenPink"
        model.value = 0.25
        model.name = "粉白"
        model.icon = "meiyan_icon_meibai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "whitenSuper"
        model.value = 0.25
        model.name = "超白"
        model.icon = "meiyan_icon_meibai"
        dataArray.append(model)
        
        // sharpen
        model = BeautyModel()
        model.name = "show_beauty_item_adjust_sharpen".show_localized
        model.icon = "show_beauty_ic_adjust_sharp"
        model.path = ""
        model.key = "sharpnessLevel"
        model.value = 0.15
        dataArray.append(model)
        
        // clarity
        model = BeautyModel()
        model.name = "show_beauty_item_adjust_clarity".show_localized
        model.icon = "show_beauty_ic_adjust_clear"
        model.path = ""
        model.key = "clarityLevel"
        model.value = 0.2
        dataArray.append(model)
        
        // shoulian
        model = BeautyModel()
        model.path = ""
        model.key = "facecontour"
        model.value = 0.4
        model.name = "show_beauty_item_beauty_overall".show_localized
        model.icon = "meiyan_icon_shoulian"
        dataArray.append(model)
        
        // xiaolian
        model = BeautyModel()
        model.path = ""
        model.key = "headscale"
        model.value = 0
        model.name = "小头"
        model.icon = "meiyan_icon_shoulian"
        dataArray.append(model)
        
        // zhailian
        model = BeautyModel()
        model.path = ""
        model.key = "facewidth"
        model.value = 0.1
        model.name = "窄脸"
        model.icon = "meiyan_icon_shoulian"
        dataArray.append(model)
        
        // changlian
        model = BeautyModel()
        model.path = ""
        model.key = "facelength"
        model.value = 0.0
        model.name = "长脸"
        model.icon = "meiyan_icon_shoulian"
        dataArray.append(model)
        
        // cheekbone
        model = BeautyModel()
        model.path = ""
        model.key = "cheekbone"
        model.value = 0.0
        model.name = "show_beauty_item_beauty_cheekbone".show_localized
        model.icon = "meiyan_icon_shouquangu"
        dataArray.append(model)
        
        // Jawline
        model = BeautyModel()
        model.path = ""
        model.key = "cheek"
        model.value = 0.3
        model.name = "show_beauty_item_beauty_jawbone".show_localized
        model.icon = "meiyan_icon_xiahegu"
        dataArray.append(model)
        
        // mandible
        model = BeautyModel()
        model.path = ""
        model.key = "mandible"
        model.value = 0.0
        model.name = "v脸"
        model.icon = "meiyan_icon_cheekV"
        dataArray.append(model)
        
        // Chin lengthening
        model = BeautyModel()
        model.path = ""
        model.key = "chin"
        model.value = 0.15
        model.name = "show_beauty_item_beauty_agora_chin".show_localized
        model.icon = "meiyan_icon_xiaba"
        dataArray.append(model)
        
        // Hairline
        model = BeautyModel()
        model.path = ""
        model.key = "forehead"
        model.value = 0.0
        model.name = "show_beauty_item_beauty_hairline".show_localized
        model.icon = "meiyan_icon_etou"
        dataArray.append(model)
        
        // remove nasolabial fold
        model = BeautyModel()
        model.path = ""
        model.key = "nasolabialFolds"
        model.value = 0.35
        model.name = "show_beauty_item_beauty_qufalingwen".show_localized
        model.icon = "meiyan_icon_qufalingwen"
        dataArray.append(model)
        
        // Eye enlarging
        model = BeautyModel()
        model.path = ""
        model.key = "eyescale"
        model.value = 0.3
        model.name = "show_beauty_item_beauty_eye".show_localized
        model.icon = "meiyan_icon_dayan"
        dataArray.append(model)
        
        // eye position
        model = BeautyModel()
        model.path = ""
        model.key = "eyeposition"
        model.value = 0.0
        model.name = "眼移动"
        model.icon = "meiyan_icon_intensityEyeHeight"
        dataArray.append(model)
        
        // eye distance
        model = BeautyModel()
        model.path = ""
        model.key = "eyedistance"
        model.value = 0.0
        model.name = "眼距"
        model.icon = "meiyan_icon_eyeSpace"
        dataArray.append(model)
        
        // eyelid
        model = BeautyModel()
        model.path = ""
        model.key = "eyelid"
        model.value = 0.0
        model.name = "眼睑下至"
        model.icon = "meiyan_icon_eyeLid"
        dataArray.append(model)
        
        // pupil
        model = BeautyModel()
        model.path = ""
        model.key = "eyepupil"
        model.value = 0.0
        model.name = "瞳孔"
        model.icon = "meiyan_icon_dayan"
        dataArray.append(model)
        
        // innercorner
        model = BeautyModel()
        model.path = ""
        model.key = "eyeinnercorner"
        model.value = 0.0
        model.name = "内眼角"
        model.icon = "meiyan_icon_dayan"
        dataArray.append(model)
        
        // outercorner
        model = BeautyModel()
        model.path = ""
        model.key = "eyeoutercorner"
        model.value = 0.0
        model.name = "外眼角"
        model.icon = "meiyan_icon_dayan"
        dataArray.append(model)
        
        // brighten eye
        model = BeautyModel()
        model.path = ""
        model.key = "brightenEye"
        model.value = 0.4
        model.name = "show_beauty_item_beauty_liangyan".show_localized
        model.icon = "meiyan_icon_liangyan"
        dataArray.append(model)
        
        // remove eye pouch
        model = BeautyModel()
        model.path = ""
        model.key = "eyePouch"
        model.value = 0.3
        model.name = "show_beauty_item_beauty_heiyanquan".show_localized
        model.icon = "meiyan_icon_heiyanquan"
        dataArray.append(model)
        
        // Nose thinning
        model = BeautyModel()
        model.path = ""
        model.key = "nosewidth"
        model.value = 0.15
        model.name = "show_beauty_item_beauty_nose".show_localized
        model.icon = "meiyan_icon_shoubi"
        dataArray.append(model)
        
        // Nose length
        model = BeautyModel()
        model.path = ""
        model.key = "noselength"
        model.value = 0.0
        model.name = "长鼻"
        model.icon = "meiyan_icon_changbi"
        dataArray.append(model)
        
        // Nose Wing
        model = BeautyModel()
        model.path = ""
        model.key = "nosewing"
        model.value = 0.0
        model.name = "鼻翼"
        model.icon = "meiyan_icon_shoubi"
        dataArray.append(model)
        
        // Nose Root
        model = BeautyModel()
        model.path = ""
        model.key = "noseroot"
        model.value = 0.0
        model.name = "山根"
        model.icon = "meiyan_icon_shoubi"
        dataArray.append(model)
        
        // Nose Bridge
        model = BeautyModel()
        model.path = ""
        model.key = "nosebridge"
        model.value = 0.0
        model.name = "鼻梁"
        model.icon = "meiyan_icon_shoubi"
        dataArray.append(model)
        
        // Nose Tip
        model = BeautyModel()
        model.path = ""
        model.key = "nosetip"
        model.value = 0.0
        model.name = "鼻尖"
        model.icon = "meiyan_icon_shoubi"
        dataArray.append(model)
        
        // Nose General
        model = BeautyModel()
        model.path = ""
        model.key = "nosegeneral"
        model.value = 0.0
        model.name = "鼻综合"
        model.icon = "meiyan_icon_shoubi"
        dataArray.append(model)
        
        // Mouth shape
        model = BeautyModel()
        model.path = ""
        model.key = "mouthscale"
        model.value = 0.15
        model.name = "show_beauty_item_beauty_mouth".show_localized
        model.icon = "meiyan_icon_zuixing"
        dataArray.append(model)
        
        // Mouth position
        model = BeautyModel()
        model.path = ""
        model.key = "mouthposition"
        model.value = 0.0
        model.name = "缩人中"
        model.icon = "meiyan_icon_mouthPosition"
        dataArray.append(model)
        
        // smile
        model = BeautyModel()
        model.path = ""
        model.key = "mouthsmile"
        model.value = 0.0
        model.name = "微笑"
        model.icon = "meiyan_icon_smile"
        dataArray.append(model)
        
        // lip
        model = BeautyModel()
        model.path = ""
        model.key = "mouthlip"
        model.value = 0.0
        model.name = "丰唇"
        model.icon = "meiyan_icon_zuixing"
        dataArray.append(model)
        
        // whiten teeth
        model = BeautyModel()
        model.path = ""
        model.key = "whitenTeeth"
        model.value = 0.35
        model.name = "show_beauty_item_beauty_teeth".show_localized
        model.icon = "meiyan_icon_meiya"
        dataArray.append(model)
        
        // eyebrow position
        model = BeautyModel()
        model.path = ""
        model.key = "eyebrowposition"
        model.value = 0.0
        model.name = "眉上下"
        model.icon = "meiyan_icon_browPosition"
        dataArray.append(model)
        
        // eyebrow thickness
        model = BeautyModel()
        model.path = ""
        model.key = "eyebrowthickness"
        model.value = 0.0
        model.name = "眉粗细"
        model.icon = "meiyan_icon_browThickness"
        dataArray.append(model)
        
        return dataArray
    }
    
    static func createAgoraAdjustData() -> [BeautyModel] {
        var dataArray = [BeautyModel]()
        
        var model = BeautyModel()
        model.name = "show_beauty_item_none".show_localized
        model.icon = "show_beauty_none"
        model.isSelected = true
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "rednessLevel"
        model.value = 0.2
        model.name = "红润"
        model.icon = "meiyan_icon_meibai_hongrun"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "hue"
        model.value = 0.0
        model.name = "色调"
        model.icon = "show_beauty_ic_adjust_clear"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "saturation"
        model.value = 0.0
        model.name = "饱合度"
        model.icon = "show_beauty_ic_adjust_saturation"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "brightness"
        model.value = 0.0
        model.name = "亮度"
        model.icon = "show_beauty_ic_adjust_clear"
        dataArray.append(model)
                
        return dataArray
    }
    
    static func createAgoraFilterData() -> [BeautyModel] {
        var dataArray = [BeautyModel]()
        var model = BeautyModel()
        model.name = "show_beauty_item_none".show_localized
        model.icon = "show_beauty_none"
        model.isSelected = true
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "暖黄"
        model.value = 0.5
        model.name = "暖黄"
        model.icon = "meiyan_icon_nenbai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "胶片"
        model.value = 0.5
        model.name = "胶片"
        model.icon = "meiyan_icon_yuansheng"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "蜜桃"
        model.value = 0.5
        model.name = "蜜桃"
        model.icon = "meiyan_icon_lengbai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "黑金"
        model.value = 0.5
        model.name = "黑金"
        model.icon = "meiyan_icon_yuansheng"
        dataArray.append(model)
        
        return dataArray
    }
    
    static func createAgoraStyleData() -> [BeautyModel] {
        var dataArray = [BeautyModel]()
        var model = BeautyModel()
        model.name = "show_beauty_item_none".show_localized
        model.icon = "show_beauty_none"
        model.isSelected = true
        dataArray.append(model)
        
        // xuejie
        model = BeautyModel()
        model.path = ""
        model.key = "学姐妆"
        model.value = 0.85
        model.name = "学姐妆"
        model.icon = "meiyan_hunxue"
        dataArray.append(model)
        
        // qizhi
        model = BeautyModel()
        model.path = ""
        model.key = "气质妆"
        model.value = 0.85
        model.name = "气质妆"
        model.icon = "meiyan_oumei"
        dataArray.append(model)
        
        // shaonv
        model = BeautyModel()
        model.path = ""
        model.key = "少女妆"
        model.value = 0.85
        model.name = "少女妆"
        model.icon = "meiyan_oumei"
        dataArray.append(model)
        
        // baitu
        model = BeautyModel()
        model.path = ""
        model.key = "白兔妆1"
        model.value = 0.85
        model.name = "白兔妆1"
        model.icon = "meiyan_oumei"
        dataArray.append(model)
        
        return dataArray
    }
    
    static func createAgoraStickerData() -> [BeautyModel] {
        var dataArray = [BeautyModel]()
        var model = BeautyModel()
        model.name = "show_beauty_item_none".show_localized
        model.icon = "show_beauty_none"
        model.isSelected = true
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "麋鹿"
        model.name = "麋鹿"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "兔子耳朵"
        model.name = "兔子耳朵"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "小熊眼罩"
        model.name = "小熊眼罩"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "招财猫"
        model.name = "招财猫"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "国风"
        model.name = "国风"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        return dataArray
    }
}
