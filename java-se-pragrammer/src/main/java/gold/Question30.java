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
 * Date  : 2017/12/13 19:56
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question30 {
    public static void main(String[] args) {
        UnaryOperator<Double> uo1 = s -> s * 2;

        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);

        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv))
                .forEach(s -> System.out.print(s + ""));
    }
}
