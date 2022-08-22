package info.xiaomo.rental.entity.customer;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/5/31 11:22
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class SVIPCustomer extends Customer {
    public SVIPCustomer(long id, String name) {
        super(id, name);
    }

    @Override
    public double getDiscount() {
        return 0.6;
    }

}
