package gold.bean;

import java.util.concurrent.atomic.AtomicInteger;

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
 * Date  : 2017/12/14 15:31
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class MyThread implements Runnable {

    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        int x = count.incrementAndGet();
        System.out.println(x);
    }
}
