package gold;

import java.util.Arrays;
import java.util.Comparator;
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
 * Date  : 2017/12/14 16:42
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question74 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 8,30);
        Integer integer = nums.stream().max(Comparator.comparing(a -> a)).get();
        System.out.println(integer);
    }
}
