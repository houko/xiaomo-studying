package info.xiaomo.extend;

import info.xiaomo.extend.bean.Circle;
import info.xiaomo.extend.bean.Shape;
import info.xiaomo.extend.bean.Square;

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
 * Date  : 17/7/6 19:32
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Extend {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();
    }

}
