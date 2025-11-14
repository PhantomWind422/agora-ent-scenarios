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
        dataArray.append(model)
        
        // template
        model = BeautyModel()
        model.path = ""
        model.key = "templateBaitu"
        model.value = 0
        model.name = "模板-白兔"
        model.icon = "meiyan_fgz_tianmei"
        model.isSelected = true
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
        model.name = "小脸"
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
        
        // Jawline
        model = BeautyModel()
        model.path = ""
        model.key = "cheek"
        model.value = 0.3
        model.name = "show_beauty_item_beauty_jawbone".show_localized
        model.icon = "meiyan_icon_xiahegu"
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
        model.key = "CT"
        model.value = 0.5
        model.name = "CT"
        model.icon = "meiyan_icon_yuansheng"
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
        model.key = "旅途"
        model.value = 0.5
        model.name = "旅途"
        model.icon = "meiyan_icon_lengbai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "美式胶片"
        model.value = 0.5
        model.name = "美式胶片"
        model.icon = "meiyan_icon_yuansheng"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "蓝调胶片"
        model.value = 0.5
        model.name = "蓝调胶片"
        model.icon = "meiyan_icon_nenbai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "日杂"
        model.value = 0.5
        model.name = "日杂"
        model.icon = "meiyan_icon_lengbai"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "京都"
        model.value = 0.5
        model.name = "京都"
        model.icon = "meiyan_icon_yuansheng"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "爱之城"
        model.value = 0.5
        model.name = "爱之城"
        model.icon = "meiyan_icon_nenbai"
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
        
        model = BeautyModel()
        model.path = ""
        model.key = "洛丽塔"
        model.value = 0.5
        model.name = "洛丽塔"
        model.icon = "meiyan_icon_nenbai"
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
        model.key = "xuejie"
        model.value = 0.5
        model.name = "show_beauty_item_effect_xuejie".show_localized
        model.icon = "meiyan_hunxue"
        dataArray.append(model)
        
        // xuemei
        model = BeautyModel()
        model.path = ""
        model.key = "xuemei"
        model.value = 0.5
        model.name = "show_beauty_item_effect_xuemei".show_localized
        model.icon = "meiyan_oumei"
        dataArray.append(model)
        
        // baitu1
        model = BeautyModel()
        model.path = ""
        model.key = "baitu1"
        model.value = 0.5
        model.name = "白兔妆1"
        model.icon = "meiyan_hunxue"
        dataArray.append(model)
        
        // baitu2
        model = BeautyModel()
        model.path = ""
        model.key = "baitu2"
        model.value = 0.5
        model.name = "白兔妆2"
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
        model.key = "2周年庆"
        model.name = "2周年庆"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "3周年庆"
        model.name = "3周年庆"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "爱心"
        model.name = "爱心"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "哈芝节"
        model.name = "哈芝节"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "蝴蝶结"
        model.name = "蝴蝶结"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "花海口罩"
        model.name = "花海口罩"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "滑雪镜"
        model.name = "滑雪镜"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "猫猫眼"
        model.name = "猫猫眼"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "前景测试"
        model.name = "前景测试"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "世界杯"
        model.name = "世界杯"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "屠妖节"
        model.name = "屠妖节"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        model = BeautyModel()
        model.path = ""
        model.key = "兔耳朵"
        model.name = "兔耳朵"
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
        model.key = "兔子眼罩"
        model.name = "兔子眼罩"
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
        model.key = "新年快乐"
        model.name = "新年快乐"
        model.icon = "meiyan_sticker_zhaocaimao"
        dataArray.append(model)
        
        return dataArray
    }
}
