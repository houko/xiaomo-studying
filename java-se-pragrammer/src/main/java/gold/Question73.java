package gold;

import gold.bean.Sum;

import java.util.concurrent.ForkJoinPool;

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
 * Date  : 2017/12/14 16:35
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question73 {
    public static void main(String[] args) {
        ForkJoinPool fjPool = new ForkJoinPool();
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        fjPool.invoke(new Sum(data, 0, data.length));
    }
}
