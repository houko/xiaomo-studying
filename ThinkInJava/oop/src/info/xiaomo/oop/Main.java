package info.xiaomo.oop;

import info.xiaomo.oop.bean.ILight;
import info.xiaomo.oop.bean.impl.Light;

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
 * Date: 17/6/5 12:19
 * Description: main
 * Copyright(©) 2017 by xiaomo.
 */
public class Main {
    public static void main(String[] args) {
        ILight light = new Light();
        light.on();
        light.brighten();
        light.dim();
        light.off();
        light.dim();
//        light.dim();

    }

}
