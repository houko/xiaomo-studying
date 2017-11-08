package info.xiaomo.observer.display.impl;

import info.xiaomo.observer.bean.WeatherData;
import info.xiaomo.observer.display.DisPlayElement;

import java.util.Observable;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiamoo.info
 * QQ    : 83387856
 * Date  : 17/6/15 10:51
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class CurrentConditionsDisplay implements DisPlayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("现在的温度")
                .append(temperature)
                .append("\n现在的湿度")
                .append(humidity)
                .append("\n现在的气压")
                .append(pressure);
        System.out.println(sb.toString());
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
