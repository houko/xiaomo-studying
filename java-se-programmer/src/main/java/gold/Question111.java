package gold;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
 * Date  : 2017/12/16 15:34
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question111 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.println((i++) + ":");
            return result;
        };

        str.stream().filter(test).findFirst().ifPresent(System.out::println);
    }
}
