package info.xiaomo.strategy.bean;

import info.xiaomo.strategy.bean.base.Context;
import info.xiaomo.strategy.behavior.operate.impl.AddOperate;

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
 * Date  : 2017/7/17 11:30
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class AddContext extends Context {
    public AddContext() {
        super(new AddOperate());
    }
    public void count( int a, int b){
        System.out.println( operate.doOperate(a,b));
    }
}
