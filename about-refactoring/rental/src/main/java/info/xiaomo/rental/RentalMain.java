package info.xiaomo.rental;

import info.xiaomo.rental.entity.Customer;
import info.xiaomo.rental.entity.Rental;
import info.xiaomo.rental.entity.movie.ChildMovie;
import info.xiaomo.rental.entity.movie.NewMovie;
import info.xiaomo.rental.entity.movie.NormalMovie;
import info.xiaomo.rental.util.IDUtil;

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
 * Date  : 2018/5/31 10:19
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class RentalMain {
    public static void main(String[] args) {
        // 来了一个顾客
        Customer customer = new Customer(IDUtil.getId(), "小莫");
        NewMovie movie1 = new NewMovie(IDUtil.getId(), "头号玩家", 5);
        ChildMovie movie2 = new ChildMovie(IDUtil.getId(), "猫和老鼠", 2);
        NormalMovie movie3 = new NormalMovie(IDUtil.getId(), "夏目友人账", 100);
        Rental rental = new Rental(IDUtil.getId(), customer, movie1, movie2, movie3);
        customer.addRental(rental);

    }
}
