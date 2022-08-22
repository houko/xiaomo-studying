package info.xiaomo.rental.entity;

import info.xiaomo.rental.entity.customer.Customer;
import info.xiaomo.rental.entity.movie.Movie;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Date  : 2018/5/31 10:30
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
@Data
public class Rental {

    private long id;

    private List<Movie> movieList = new ArrayList<>();

    private Customer customer;

    private int rentalTime;


    public Rental(long id, Customer customer, Movie... movie) {
        this.id = id;
        movieList.addAll(Arrays.asList(movie));
        this.customer = customer;
        this.rentalTime = (int) (System.currentTimeMillis() / 1000);
    }


    public int getLeftTime() {
        return (int) (System.currentTimeMillis() / 1000 - rentalTime);
    }

}
