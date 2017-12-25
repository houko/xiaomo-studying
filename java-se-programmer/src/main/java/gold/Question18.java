package gold;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

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
 * Date  : 2017/12/12 10:54
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question18 {
    public static void main(String[] args) {
        ZonedDateTime depart = ZonedDateTime.of(2015,1,15,3,0,0,0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015,1,15,9,0,0,0, ZoneId.of("UTC-5"));
        long hur = ChronoUnit.HOURS.between(depart,arrive);
        System.out.println("Travel time is " + hur + " hours");
    }
}
