package gold;

import gold.bean.Vehicle;

import java.util.TreeSet;

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
 * Date  : 2017/12/16 15:27
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question109 {
    public static void main(String[] args) {
        TreeSet<Vehicle> objects = new TreeSet<>();
        objects.add(new Vehicle(10123, "Ford"));
        objects.add(new Vehicle(10124, "BWV"));
        System.out.println(objects);
    }
}
