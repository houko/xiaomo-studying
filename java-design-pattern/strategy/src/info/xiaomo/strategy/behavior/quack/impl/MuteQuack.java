package info.xiaomo.strategy.behavior.quack.impl;

import info.xiaomo.strategy.behavior.quack.QuackBehavior;

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
 * Date: 17/6/5 09:59
 * Description:
 * Copyright(©) 2017 by xiaomo.
 */

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("我不会叫...");
    }
}
