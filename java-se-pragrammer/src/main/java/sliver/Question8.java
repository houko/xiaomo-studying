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
 * Date    : 2017/11/15 20:09
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2014-05-04");
        String format = date.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println(format);
        // FIXME: 2017/11/15 要好好研究一下localDate的format参数
        // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
    }
}
