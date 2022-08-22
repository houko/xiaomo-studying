package info.xiaomo.adapter.duck;


import info.xiaomo.adapter.behavior.fly.FlyBehavior;
import info.xiaomo.adapter.behavior.quack.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

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
 * Date: 17/6/5 09:53
 * Description:
 * Copyright(©) 2017 by xiaomo.
 *
 * @author qq
 */

@Slf4j
public abstract class AbstractDuck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 外观
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        log.info("所有鸭子游泳");
    }


}
