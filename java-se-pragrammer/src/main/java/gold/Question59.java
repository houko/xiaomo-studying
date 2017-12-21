package gold;

import gold.bean.TechName;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
 * Date  : 2017/12/21 10:43
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question59 {
    public static void main(String[] args) {
        List<TechName> tech = Arrays.asList(
                new TechName("Java-"),
                new TechName("Oracle DB-"),
                new TechName("J2EE-")
        );

        Stream<TechName> stre = tech.stream();
        stre.map(a -> a.techName).forEach(System.out::print);
    }
}
