package info.xiaomo.decorator.decortor;

import info.xiaomo.decorator.bean.Beverage;

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
 * Date  : 2017/7/17 17:21
 * desc  : 牛奶
 * Copyright(©) 2017 by xiaomo.
 */
public class Milk extends AbstractCondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，牛奶";
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
