package info.xiaomo.strategy.bean;

import info.xiaomo.strategy.bean.base.AbstractDuck;
import info.xiaomo.strategy.behavior.fly.impl.FlyNotWay;
import info.xiaomo.strategy.behavior.quack.impl.MuteQuack;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/syoubaku
 * email: xiaomo@xiamoo.info
 * QQ_NO: 83387856
 * Date: 17/6/5 10:08
 * Description: 诱惑鸭不会飞也不会叫
 * Copyright(©) 2017 by xiaomo.
 */
public class DecoyDuck extends AbstractDuck {

    public DecoyDuck() {
       flyBehavior = new FlyNotWay();
       quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是诱惑鸭");
    }
}
