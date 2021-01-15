package info.xiaomo.adapter.behavior.operate.impl;


import info.xiaomo.adapter.behavior.operate.Operate;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 11:28
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class MultiplyOperate implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a * b;
    }
}
