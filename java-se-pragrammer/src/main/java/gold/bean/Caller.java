package gold.bean;

import java.util.concurrent.Callable;

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
 * Date  : 2017/12/21 19:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Caller implements Callable<String> {
    String string;

    public Caller(String string) {
        this.string = string;
    }

    @Override
    public String call() throws Exception {
        return string.concat("Runner");
    }
}
