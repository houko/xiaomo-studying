package gold;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

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
 * Date  : 2017/12/14 16:12
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question69 {
    public static void main(String[] args) {
        Stream<List<String>> stream = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));
        Stream<String> stringStream = stream.flatMap(Collection::stream);
        stringStream.forEach(System.out::print);
        // 1John2null
    }
}
