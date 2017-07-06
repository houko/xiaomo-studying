package info.xiaomo.combine.bean;

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
 * Date  : 17/7/6 19:42
 * desc  : 汽车
 * Copyright(©) 2017 by xiaomo.
 */
public class Car {

    private Engine engine;

    private Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive() {
        if (!engine.orderPower()){
            System.out.println("没有引擎不能开");
            return;
        }
        if (!wheel.move()){
            System.out.println("没有轮子不能开");
        }
        System.out.println("滴,老司机卡,快开车......");

    }

}
