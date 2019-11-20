package study;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
 * Date  : 2017/12/22 14:25
 * desc  : 基本类型的流 IntStream,DoubleStream,LongStream
 * Copyright(©) 2017 by xiaomo.
 */
public class BasicStream {
    public static void main(String[] args) {
        // int[]
        IntStream.of(1, 2, 3).forEach(System.out::println);
        System.out.println();
        // 前闭后开区间
        IntStream.range(1, 3).forEach(System.out::println);
        System.out.println();
        // 闭区间
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println();
        // Double[]
        DoubleStream.of(1D, 2D, 3D).forEach(System.out::println);
        System.out.println();
        LongStream.of(1L, 2L, 3L).forEach(System.out::println);

    }
}
