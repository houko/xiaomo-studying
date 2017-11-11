package info.xiaomo.adapter;

import info.xiaomo.adapter.behavior.fly.impl.FlyNotWay;
import info.xiaomo.adapter.behavior.quack.impl.Quack;
import info.xiaomo.adapter.duck.AbstractDuck;

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
 * Date  : 2017/7/17 20:35
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 *
 * @author qq
 */
public class DuckAdapter extends AbstractDuck {
    private Cat cat;

    public DuckAdapter(Cat cat) {
        this.cat = cat;
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyNotWay();
    }

    @Override
    public void display() {
        cat.display();
    }

    @Override
    public void performFly() {
        cat.fly();
    }

    @Override
    public void performQuack() {
        cat.quake();
    }
}
