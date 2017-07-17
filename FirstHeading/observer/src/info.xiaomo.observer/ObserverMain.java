package info.xiaomo.observer;

import info.xiaomo.observer.bean.WeatherData;
import info.xiaomo.observer.display.impl.CurrentConditionsDisplay;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiamoo.info
 * QQ    : 83387856
 * Date  : 17/6/15 10:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class ObserverMain {
    public static void main(String[] args) {
        // 获得一个气象站数据实例
        WeatherData weatherData = new WeatherData();
        // 注册观察者
        Register.init(weatherData);
        // 数据发生变化
        weatherData.setMeasurements(10,20,30);

    }

}
