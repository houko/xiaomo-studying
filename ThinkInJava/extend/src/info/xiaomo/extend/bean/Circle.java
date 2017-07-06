package info.xiaomo.extend.bean;

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
 * Date  : 17/7/6 19:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("我是圆");
    }

    public void roll(){
        System.out.println("滚动...");
    }
}
