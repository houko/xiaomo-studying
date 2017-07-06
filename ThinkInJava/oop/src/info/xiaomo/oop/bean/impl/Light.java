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
 * Date: 17/6/5 12:13
 * Description:
 * Copyright(©) 2017 by xiaomo.
 */
public class Light implements ILight {

    private boolean isOpen = false;
    private int lighter = 5;


    @Override
    public void on() {
        if (isOpen) {
            System.out.println("灯本来就是开着的");
            return;
        }
        isOpen = true;
        System.out.println("灯开了");
    }

    @Override
    public void off() {
        if (!isOpen) {
            System.out.println("灯本来就是关着的");
            return;
        }
        isOpen = false;
        System.out.println("关灯");
    }

    @Override
    public void brighten() {
        if (!isOpen) {
            System.out.println("灯没开不能调亮度");
            return;
        }
        lighter++;
        System.out.println("变亮" + lighter);
    }

    @Override
    public void dim() {
        if (!isOpen) {
            System.out.println("灯没开不能调亮度");
            return;
        }
        lighter--;
        System.out.println("变暗" + lighter);
    }
}
