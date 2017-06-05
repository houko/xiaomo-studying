package info.xiaomo.bean;

import info.xiaomo.bean.base.Duck;
import info.xiaomo.behavior.fly.impl.FlyNotWay;
import info.xiaomo.behavior.fly.impl.FlyRocketPower;
import info.xiaomo.behavior.fly.impl.FlyWithWings;
import info.xiaomo.behavior.quack.impl.MuteQuack;
import info.xiaomo.behavior.quack.impl.Quack;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/syoubaku
 * email: xiaomo@xiamoo.info
 * QQ_NO: 83387856
 * Date: 17/6/5 10:08
 * Description: 火箭鸭
 * Copyright(©) 2017 by xiaomo.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
       flyBehavior = new FlyRocketPower();
       quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是火箭鸭");
    }
}
