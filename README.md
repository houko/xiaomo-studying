exchanger是一款汇率换算的app,目前只支持RMB和JPY(日元)之间的换算。当然，如果想实现其他币种的汇率换算也很简单,添加一个下拉框把参数放在里面.然后去请求api获取对应的汇率就可以实现计算啦.这个有空的时候再做吧

### 一. 主要功能
1. 点击对应数字按钮和小数点按钮会在输入栏中显示对应的结果
输入框中的数只能允许存在一个小数点
2. 删除按钮会将最后一位数字删除
如果最后一位数是小数点,则小数点也会被清除
3. 显示当前汇率
使用`Alamofire`异步获取汇率api,然后采用`swiftJSON`解析json数据并展示
4. 清除按钮
会将输入栏和结果栏的数据全部置0
5. 切换按钮
可以切换RMB和JPY(日元)的实时汇率和换算功能. 

### 二.使用技术
1. 整个功能采用swift3.0.2实现
2. pod 1.2.1 管理依赖
3. 网络框架`Alamofire`4.4 获取api数据
4. 使用`swiftJSON`3.1.4对获取的json数据进行解析
5. 使用`SnapKit`3.2.0做自动布局(暂未实现)

### 三.截图
![](http://image.xiaomo.info/swift/exchanger-icon.png)
![](http://image.xiaomo.info/swift/exchanger-ui.png)

### 四. 功能演示
![](http://image.xiaomo.info/swift/exchanger.gif)


### 五. 做此app的动机
1. 最近在学swift,这是个不错的练手项目
2. 打算去日本,所以做个app装到自己手机上用,即方便又有成就感,哈哈哈

### 六. 实现细节
1. 当前汇率
在`viewDidload`的时候调用`getNowOfCurrency`,远程获取实时汇率并显示

```
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
```

2. 数字按钮
创建一个action绑定所有的数字键,使用 += 直接拼接字符串显示在输入框

```
    
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
    
```


3. 删除键

多重判断
如果当前是空串,结果显示为0
如果当前最后一位是小数点,去掉小数点
否则直接截取最后一位

```
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

```


4. 清除

将输入框和结果框置为0

```
    /// 清除
    ///
    /// - Parameter sender: sender
    @IBAction func onClearBtnClicked(_ sender: Any) {
        if fromValueLabel != nil {
            fromValueLabel.text = "0"
            toValueLabel.text = "0"
        }
    }

```

5. 计算
根据当前的汇率计算结果并显示

```
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
```


6. 点
数字不能存在多个小数点,判断当前字符串是否存在小数点,如果存在则不能继续添加小数点

```
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
```

7. 反转
将汇率切换,输入框和结果框对调

```
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
```
