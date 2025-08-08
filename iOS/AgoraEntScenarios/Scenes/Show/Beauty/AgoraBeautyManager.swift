//
//  AgoraBeautyManager.swift
//  AgoraEntScenarios
//
//  Created by zhaoyongqiang on 2023/11/10.
//

import Foundation

var m_beauty_bundle_copied = false;
let beauty_effect_node_all = AgoraVideoEffectNodeId.beauty.rawValue | AgoraVideoEffectNodeId.styleMakeup.rawValue | AgoraVideoEffectNodeId.filter.rawValue

class AgoraBeautyManager: NSObject {
    var agoraKit: AgoraRtcEngineKit?
    var beautyEffect: AgoraVideoEffectObject?
    private var _beautyTemplate: String? = nil
    var beautyTemplate: String? {
        set {
            if _beautyTemplate == newValue {
                return
            }
            _beautyTemplate = newValue
            if _beautyTemplate == nil {
                enableBeauty(false)
            } else {
                enableBeauty(true)
            }
        }
        get {
            return _beautyTemplate
        }
    }
    private var _filterTemplate: String? = nil
    var filterTemplate: String? {
        set {
            if _filterTemplate == newValue {
                return
            }
            _filterTemplate = newValue
            if _filterTemplate == nil {
                enableFilter(false)
            } else {
                enableFilter(true)
            }
        }
        get {
            return _filterTemplate
        }
    }
    private var _makeupTemplate: String? = nil
    var makeupTemplate: String? {
        set {
            if _makeupTemplate == newValue {
                return
            }
            _makeupTemplate = newValue
            if _makeupTemplate == nil {
                enableMakeup(false)
            } else {
                enableMakeup(true)
            }
        }
        get {
            return _makeupTemplate
        }
    }
    private var _stickerTemplate: String? = nil
    var stickerTemplate: String? {
        set {
            if _stickerTemplate == newValue {
                return
            }
            _stickerTemplate = newValue
            if _stickerTemplate == nil {
                enableSticker(false)
            } else {
                enableSticker(true)
            }
        }
        get {
            return _stickerTemplate
        }
    }
    lazy var render = AgoraBeautyRender()
    private static var _sharedManager: AgoraBeautyManager?
    static var shareManager: AgoraBeautyManager {
        get {
            if let sharedManager = _sharedManager { return sharedManager }
            let sharedManager = AgoraBeautyManager()
            _sharedManager = sharedManager
            return sharedManager
        }
        set {
            _sharedManager = nil
        }
    }
    
    // Copy bundle to sandbox because we need file save permissions
    let material_copy_dest_path: String = NSHomeDirectory() + "/Documents/AgoraBeautyMaterial.bundle";
    
    static func castFromPositive100(_ value: Int32) -> Float {
        return 0.01 * Float(value);
    }
    
    static func castToPositive100(_ value: Float) -> Int32 {
        return Int32(roundf(100.0 * value));
    }
    
    func initBeautyEffect() {
        // copy bundle
        copyBeautyBundle()
        // enter beauty effect
        let path = material_copy_dest_path + "/" + "sticker_material";
        beautyEffect = agoraKit?.createVideoEffectObject(bundlePath: path, sourceType: AgoraMediaSourceType.primaryCamera)
    }
    
    func setBeauty(path: String?, key: String?, value: CGFloat) {
        if key == nil {
            // close beauty effect
            beautyTemplate = nil
        }
        // beauty has no template ui selection. use default template
        beautyTemplate = ""
        switch key ?? "" {
        case "smoothnessLevel":
            beautyEffect?.setVideoEffectFloatParam(option: "beauty_effect_option", key: "smoothness", floatValue: Float(value))
        break
        case "lighteningLevel":
            beautyEffect?.setVideoEffectFloatParam(option: "beauty_effect_option", key: "lightness", floatValue: Float(value))
        break
        case "rednessLevel":
            beautyEffect?.setVideoEffectFloatParam(option: "beauty_effect_option", key: "redness", floatValue: Float(value))
        break
        
        case "forehead":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.forehead
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "facecontour":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.faceContour
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "cheekbone":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.cheekbone
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "cheek":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.cheek
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "chin":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.chin
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "eyescale":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.eyeScale
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "nosewidth":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.noseWidth
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "mouthscale":
            let areaOption = AgoraFaceShapeAreaOptions()
            areaOption.shapeArea = AgoraFaceShapeArea.mouthScale
            areaOption.shapeIntensity = AgoraBeautyManager.castToPositive100(Float(value))
            agoraKit?.setFaceShapeAreaOptions(areaOption)
        break
        case "brightenEye":
            beautyEffect?.setVideoEffectFloatParam(option: "face_buffing_option", key: "brighten_eye", floatValue: Float(value))
        break
        case "eyePouch":
            beautyEffect?.setVideoEffectFloatParam(option: "face_buffing_option", key: "eye_pouch", floatValue: Float(value))
        break
        case "nasolabialFolds":
            beautyEffect?.setVideoEffectFloatParam(option: "face_buffing_option", key: "nasolabial_fold", floatValue: Float(value))
        break
        case "whitenTeeth":
            beautyEffect?.setVideoEffectFloatParam(option: "face_buffing_option", key: "whiten_teeth", floatValue: Float(value))
        break
        
        default: break
        }
    }
    
    func setStyle(path: String?, key: String?, value: CGFloat) {
        if key == nil {
            // close stylemakeup effect
            makeupTemplate = nil
        }
        else if key == "init" {
            // load stylemakeup default template
            makeupTemplate = ""
        }
        switch key ?? "" {
        case "xuejie":
            makeupTemplate = "学姐妆"
            beautyEffect?.setVideoEffectFloatParam(option: "style_makeup_option", key: "styleIntensity", floatValue: Float(value))
        break
        case "xuemei":
            makeupTemplate = "学妹妆"
            beautyEffect?.setVideoEffectFloatParam(option: "style_makeup_option", key: "styleIntensity", floatValue: Float(value))
        break
        default:
        break
        }
    }
    
    func setSticker(path: String?, key: String?, value: CGFloat) {
        if key == nil {
            // close sticker effect
            stickerTemplate = nil
        }
        else if key == "init" {
            // load stylemakeup default template
            stickerTemplate = ""
        }
        switch key ?? "" {
        case "zhaocaimao":
            stickerTemplate = "招财猫"
        break
        case "milu":
            stickerTemplate = "鹿"
        break
        default:
        break
        }
    }
    
    func setFilter(path: String?, key: String?, value: CGFloat) {
        if key == nil {
            // close filter effect
            filterTemplate = nil
        }
        else if key == "init" {
            // load filter default template
            filterTemplate = ""
        }
        switch key ?? "" {
        case "yuansheng":
            filterTemplate = "原生"
            beautyEffect?.setVideoEffectFloatParam(option: "filter_effect_option", key: "strength", floatValue: Float(value))
        break
        case "lengbai":
            filterTemplate = "冷白"
            beautyEffect?.setVideoEffectFloatParam(option: "filter_effect_option", key: "strength", floatValue: Float(value))
        break
        case "nenbai":
            filterTemplate = "嫩白"
            beautyEffect?.setVideoEffectFloatParam(option: "filter_effect_option", key: "strength", floatValue: Float(value))
        break
        default:
        break
        }
    }
    
    func enableBeauty(_ enabled: Bool) {
        if (enabled) {
            // load last effect templates
            beautyEffect?.addOrUpdateVideoEffect(nodeId: AgoraVideoEffectNodeId.beauty.rawValue, templateName: _beautyTemplate ?? "")
        } else {
            // remove all effects
            beautyEffect?.removeVideoEffect(nodeId: AgoraVideoEffectNodeId.beauty.rawValue)
        }
    }
    
    func enableFilter(_ enabled: Bool) {
        if (enabled) {
            // load last effect templates
            beautyEffect?.addOrUpdateVideoEffect(nodeId: AgoraVideoEffectNodeId.filter.rawValue, templateName: _filterTemplate ?? "")
        } else {
            // remove all effects
            beautyEffect?.removeVideoEffect(nodeId: AgoraVideoEffectNodeId.filter.rawValue)
        }
    }
    
    func enableMakeup(_ enabled: Bool) {
        if (enabled) {
            // load last effect templates
            beautyEffect?.addOrUpdateVideoEffect(nodeId: AgoraVideoEffectNodeId.styleMakeup.rawValue, templateName: _makeupTemplate ?? "")
        } else {
            // remove all effects
            beautyEffect?.removeVideoEffect(nodeId: AgoraVideoEffectNodeId.styleMakeup.rawValue)
        }
    }
    
    func enableSticker(_ enabled: Bool) {
        if (enabled) {
            beautyEffect?.addOrUpdateVideoEffect(nodeId: AgoraVideoEffectNodeId.sticker.rawValue, templateName: _stickerTemplate ?? "")
        } else {
            beautyEffect?.removeVideoEffect(nodeId: AgoraVideoEffectNodeId.sticker.rawValue)
        }
    }
    
    func enable(_ enabled: Bool) {
        enableBeauty(enabled)
        enableMakeup(enabled)
        enableFilter(enabled)
        enableSticker(enabled)
    }
    
    func reset(datas: [BeautyModel]) {
        beautyTemplate = nil
    }
    
    func resetStyle(datas: [BeautyModel]) {
        makeupTemplate = nil
    }
    
    func resetFilter(datas: [BeautyModel]) {
        filterTemplate = nil
    }
    
    func resetSticker(datas: [BeautyModel]) {
        stickerTemplate = nil
    }
            
    func destroy() {
        // remove all effect
        enable(false)
        // exit beauty material
        agoraKit?.destroyVideoEffectObject(beautyEffect)
        beautyEffect = nil
        AgoraBeautyManager._sharedManager = nil
        agoraKit?.enableExtension(withVendor: "agora_video_filters_clear_vision",
                                  extension: "clear_vision",
                                  enabled: false,
                                  sourceType: .primaryCamera)
    }
    
    private func copyBeautyBundle() {
        if (m_beauty_bundle_copied) {
            return
        }
        let bundle_path = Bundle.main.path(forResource: "AgoraBeautyMaterial", ofType: "bundle")
        if FileManager.default.fileExists(atPath: material_copy_dest_path) {
            try? FileManager.default.removeItem(atPath: material_copy_dest_path)
        }
        try? FileManager.default.copyItem(atPath: bundle_path!, toPath: material_copy_dest_path)
        m_beauty_bundle_copied = true
    }
}
