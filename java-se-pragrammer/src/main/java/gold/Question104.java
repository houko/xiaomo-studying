package gold;

import java.util.Arrays;
import java.util.List;

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
 * Date  : 2017/12/16 15:04
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question104 {
    public static void main(String[] args) {
        List<String> empDetails = Arrays.asList("100,Robin,HR", "200,Mary,AdminServices", "101,Peter,HR");
        empDetails.stream().filter(s -> s.contains("1")).sorted().forEach(System.out::println);
    }
}
