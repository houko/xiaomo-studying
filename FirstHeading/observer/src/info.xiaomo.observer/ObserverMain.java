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

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20.0f, 1.5f, 400.1f);
        display.display();
    }

}
