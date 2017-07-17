package info.xiaomo.decorator.bean;

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
 * Date  : 2017/7/17 17:22
 * desc  : 配料装饰器
 * Copyright(©) 2017 by xiaomo.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
