package info.xiaomo.oop.bean.impl;

import info.xiaomo.oop.bean.ILight;

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
 * Date: 17/6/1 11:26
 * Description:
 * Copyright(©) 2017 by xiaomo.
 */
public class Light implements ILight{
    @Override
    public void on() {
        System.out.println("灯打开了");
    }

    @Override
    public void off() {
        System.out.println("灯关了");
    }

    @Override
    public void brighten() {
        System.out.println("灯变亮了");
    }

    @Override
    public void dim() {
        System.out.println("灯变暗了");
    }
}
