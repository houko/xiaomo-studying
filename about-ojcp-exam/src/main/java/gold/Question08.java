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
 * Date  : 2017/12/9 15:23
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 * <p>
 * allMatch的作用是 是否全匹配(功能类似于下面的写法)
 * <p>
 * for(e:list){
 * if(!n.test(e)){
 * return false
 * }
 * }
 * return true
 */
public class Question08 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching...");
            return n.contains("red");
        };
        colors.stream().filter(c -> c.length() > 3).allMatch(test);
    }
}
