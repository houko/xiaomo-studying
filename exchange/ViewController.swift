//
//  ViewController.swift
//  exchange
//
//  Created by xiaomo on 2017/04/21.
//  Copyright © 2017年 xiaomo. All rights reserved.
//

import UIKit
import Alamofire
import SwiftyJSON

class ViewController: UIViewController {

    @IBOutlet weak var fromValueLabel: UILabel!
    @IBOutlet weak var toValueLabel: UILabel!
    @IBOutlet weak var rmbLabel: UILabel!
    @IBOutlet weak var enLabel: UILabel!
    @IBOutlet weak var currentCurrenyLabel: UILabel!
    var rmbToEnFlag = true // 默认人民币到日元
    let rmbToJpyUrl = "http://api.k780.com:88/?app=finance.rate&scur=CNY&tcur=JPY&appkey=24935&sign=2549e4966ed7897420aa023cde6a06cb"
    let jpyToRmbUrl = "http://api.k780.com:88/?app=finance.rate&scur=JPY&tcur=CNY&appkey=24935&sign=2549e4966ed7897420aa023cde6a06cb"
    var rmbToEn:Float = 1.0
    var enToRmb:Float = 1.0
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // 获取当前汇率
        getNowOfCurrency()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    

    func getNowOfCurrency(){
        Alamofire.request(rmbToJpyUrl).responseJSON { response in
            if let data = response.result.value {
                let swiftyJsonVar = JSON(data)
                let rate = swiftyJsonVar["result"]["rate"].floatValue
                self.rmbToEn = Float(rate)
                self.currentCurrenyLabel.text = "\(self.rmbToEn)"
            }
        }
        
        Alamofire.request(jpyToRmbUrl).responseJSON { response in
            if let data = response.result.value {
                let swiftyJsonVar = JSON(data)
                let rate = swiftyJsonVar["result"]["rate"].floatValue
                self.enToRmb = Float(rate)
            }
        }
    }
    
    /// 数字
    ///
    /// - Parameter sender: button
    @IBAction func onNumberCliecked(_ sender: UIButton) {
        guard var valueText = fromValueLabel.text   else {
            return
        }
        guard let label:UILabel = sender.titleLabel  else {
            return
        }
        guard let labelText = label.text else {
            return
        }
        
        if (valueText == "0"){
            valueText = "\(labelText)"
        } else {
            valueText += "\(labelText)"
        }
        fromValueLabel.text = valueText
    }
    
    
    
    /// 删除
    ///
    /// - Parameter sender: sender
    @IBAction func onDeleteBtnClicked(_ sender: Any) {
        guard let valueText = fromValueLabel.text else {
            return
        }
        let index = valueText.index(valueText.endIndex, offsetBy: -1)
        let substring = valueText.substring(to: index)
        if (substring == "") { // 删除一位变成了空串
            fromValueLabel.text = "0"
        } else if (substring.substring(from: substring.index(substring.endIndex, offsetBy: -1)) == "."){ // 减掉一位最后一位是小数点
            let endIndex = substring.index(substring.endIndex, offsetBy: -1)
            fromValueLabel.text = substring.substring(to: endIndex)
        } else { // 减掉一位 最后一位是数字
            fromValueLabel.text = substring
        }
    }
    
    
    
    /// 清除
    ///
    /// - Parameter sender: sender
    @IBAction func onClearBtnClicked(_ sender: Any) {
        if fromValueLabel != nil {
            fromValueLabel.text = "0"
            toValueLabel.text = "0"
        }
    }
    
    
    
    /// 计算
    ///
    /// - Parameter sender: sender
    @IBAction func onCalBtnClicked(_ sender: Any) {
        guard let valueText = fromValueLabel.text else {
            return
        }
        let current: Float = Float(valueText)!
        let amount = rmbToEnFlag ? current * rmbToEn : current * enToRmb
        toValueLabel.text = "\(amount)"
    }
    

    
    /// 反转
    ///
    /// - Parameter sender: sender
    @IBAction func reverse(_ sender: Any) {
        if (rmbToEnFlag) {
            rmbLabel.text = "円"
            enLabel.text = "¥"
            currentCurrenyLabel.text = "\(enToRmb)"
        } else {
            rmbLabel.text = "¥"
            enLabel.text = "円"
            currentCurrenyLabel.text = "\(rmbToEn)"
        }
        rmbToEnFlag = !rmbToEnFlag
        fromValueLabel.text = "0"
        toValueLabel.text = "0"
    }
    
    
    
    /// 点
    ///
    /// - Parameter sender: sender
    @IBAction func onDotBtnClicked(_ sender: Any) {
        guard var valueText = fromValueLabel.text else {
            return
        }
        
        guard let label:UILabel = (sender as! UIButton).titleLabel else{
            return
        }
        
        guard let labelText = label.text else {
            return
        }
        
        guard valueText != "0" else{ //如果现在的值是0就不能加小数点
            return
        }
        
        guard !(valueText.range(of: ".") != nil) else { // 如果现在的值中有小数点就不能再加小数点(一个数字不可能存在2个小数点)
            return
        }
        
        valueText += "\(labelText)"
        fromValueLabel.text = valueText
    }
}

