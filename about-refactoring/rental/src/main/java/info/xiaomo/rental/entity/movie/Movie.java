package info.xiaomo.rental.entity.movie;

import info.xiaomo.rental.constant.MovieEnum;
import info.xiaomo.rental.entity.customer.Customer;
import lombok.Data;

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
 * Date  : 2018/5/31 10:18
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
@Data
public abstract class Movie {

    protected Customer customer;

    protected long id;

    protected String name;

    public abstract double getPrice();

    public abstract MovieEnum getMovieType();

    /**
     * 租的时间
     */
    protected int rentalTime;

    protected int days;

    public Movie(Customer customer, long id, String name, int days) {
        this.customer = customer;
        this.id = id;
        this.name = name;
        this.days = days;
    }
}
