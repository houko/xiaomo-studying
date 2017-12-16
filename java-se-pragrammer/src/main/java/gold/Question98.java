package gold;

import gold.bean.MoveAble;

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
 * Date  : 2017/12/16 10:33
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question98 {
    public static void main(String[] args) {
        MoveAble<Integer> animal = n -> System.out.println("running" + n);
        animal.run(100);
        animal.walk(20);


    }
}
