package gold.bean;

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
 * Date  : 2017/12/18 13:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Shop {
    private Cake c = new Cake();
    private final double discount = 0.25;

    public void makeReady() {
        c.bake(10, 120);
    }
}
