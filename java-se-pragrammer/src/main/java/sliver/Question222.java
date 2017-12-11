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
 * Date    : 2017/11/21 10:03
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question222 {
    class Vehicle{
        String type = "4W";
        int maxSpeed = 100;

        public Vehicle(String type, int maxSpeed) {
            this.type = type;
            this.maxSpeed = maxSpeed;
        }
    }

    class Car extends Vehicle{
        String trans
                ;
//        Car(String trans){
//            this.trans = trans;
//        }

        public Car(String type, int maxSpeed) {
            super(type, maxSpeed);
//            this(trans);
        }
    }
}
