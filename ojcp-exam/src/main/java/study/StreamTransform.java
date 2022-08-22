package study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
 * Date  : 2017/12/22 14:30
 * desc  : 流转换
 * Copyright(©) 2017 by xiaomo.
 */
public class StreamTransform {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3);
        int[] ints = stream.toArray();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> collect = list.stream().collect(Collectors.toList());

    }
}
