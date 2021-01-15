package info.xiaomo.adapter.behavior.fly.impl;


import info.xiaomo.adapter.behavior.fly.FlyBehavior;
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
 * Date: 17/6/5 09:57
 * Description:
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        log.info("我用翅膀飞行");
    }
}
