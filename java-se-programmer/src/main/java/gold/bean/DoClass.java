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
 * Date  : 2017/12/14 15:11
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class DoClass implements DoInterface {

    int x1, x2;

    public DoClass() {
        this.x1 = 0;
        this.x2 = 10;
    }

    @Override
    public void m1(int n) {
        x1 += n;
        System.out.println(x1);
    }

    @Override
    public void m2(int n) {
        x2 += n;
        System.out.println(x2);
    }
}
