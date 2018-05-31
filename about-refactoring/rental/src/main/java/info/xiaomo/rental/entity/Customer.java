package info.xiaomo.rental.entity;

import info.xiaomo.rental.entity.movie.Movie;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Vector;

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
 * Date  : 2018/5/31 10:20
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
@Data
@Slf4j
public class Customer {

    private long id;

    private String name;

    private Vector<Rental> rentals = new Vector<>();

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 租赁一部电影
     *
     * @param rental rental
     */
    public void addRental(Rental rental) {
        double all = 0;
        rentals.addElement(rental);
        List<Movie> movieList = rental.getMovieList();
        for (Movie movie : movieList) {
            log.info("用户:{} {} 租赁了{}:{},[类型:{}]了{}天，需要{}元", id, name, movie.getId(), movie.getName(), movie.getMovieType(), movie.getDays(), movie.getPrice());
            all += movie.getPrice();
        }
        log.info("一共需要付费:{}元", all);

    }


}
