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
 * Date  : 2017/12/16 15:30
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question110 {
    public static void main(String[] args) {
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println(listVal.stream().filter(x -> x.length() > 3).count());
        System.out.println(listVal.stream().map(x -> x.length() > 3).count());

    }
}
