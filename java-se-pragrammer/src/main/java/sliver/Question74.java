package sliver;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/20 17:23
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question74 {
    int x;

    Question74() {
        this(10);
    }

    Question74(int x) {
        this.x = x;
    }


    class Car extends Question74 {
        int y;

        Car() {
            super();
            // super 和this只能出现一个
//            this(20);

        }

        Car(int y) {
            this.y = y;
        }
    }
}
