package info.xiaomo.strategy.bean;

import info.xiaomo.strategy.bean.base.AbstractDuck;
import info.xiaomo.strategy.behavior.fly.impl.FlyWithWings;
import info.xiaomo.strategy.behavior.quack.impl.Quack;
import lombok.extern.slf4j.Slf4j;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/syoubaku
 * email: xiaomo@xiamoo.info
 * QQ_NO: 83387856
 * Date: 17/6/5 10:13
 * Description:
 * Copyright(©) 2017 by xiaomo.
 * @author qq
 */
@Slf4j
public class RedHeadDuck extends AbstractDuck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("我是红头鸭");
    }
}
