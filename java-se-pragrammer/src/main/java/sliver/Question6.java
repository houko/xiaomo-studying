package sliver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/15 19:24
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question6 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println(date1);  // 当前时间
        System.out.println(date2);  // 2014-06-20
        System.out.println(date3);  // 2014-06-20
    }
}
