package info.xiaomo.observer;

import info.xiaomo.observer.bean.WeatherData;
import info.xiaomo.observer.display.impl.CurrentConditionsDisplay;

import java.util.Observer;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 14:26
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Register {

    private static WeatherData weatherData;

    public void init(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    public static void register(Observer observer) {
        weatherData.addObserver(observer);
    }

    public static void remove(Observer observer) {
       weatherData.deleteObserver(observer);
    }
}
