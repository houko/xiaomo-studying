package info.xiaomo.combine;

import info.xiaomo.combine.bean.Car;
import info.xiaomo.combine.bean.Engine;
import info.xiaomo.combine.bean.Wheel;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 17/7/6 19:42
 * desc  : 组合模式
 * Copyright(©) 2017 by xiaomo.
 */
public class Combine {
    public static void main(String[] args) {
        Car car = new Car(new Engine(),new Wheel());
        car.drive();
    }
}
