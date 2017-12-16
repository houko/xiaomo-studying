package gold;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

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
 * Date  : 2017/12/16 17:16
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question120 {
    public static void main(String[] args) {
        List<Integer> codes = Arrays.asList(10, 20);
        UnaryOperator<Double> uo = s -> s + 10.0;
//        codes.replaceAll(uo);
        codes.forEach(System.out::print);
    }
}
