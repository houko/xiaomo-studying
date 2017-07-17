package info.xiaomo.observer.display.impl;

import info.xiaomo.observer.bean.WeatherData;
import info.xiaomo.observer.display.DisPlayElement;

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
 * Date  : 17/6/15 10:51
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class CurrentConditionsDisplay implements DisPlayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
    }

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
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
