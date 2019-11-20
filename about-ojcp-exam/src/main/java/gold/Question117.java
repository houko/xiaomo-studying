package gold;

import gold.bean.Book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
 * Date  : 2017/12/19 19:13
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question117 {
    public static void main(String[] args) {
        List<Book> li = Arrays.asList(
                new Book(20, "Sam"),
                new Book(60, "John"),
                new Book(51, "Jim")
        );

        Predicate<Book> books = s -> s.getId() > 50;
        li = li.stream().filter(books).collect(Collectors.toList());
        Stream<String> stream = li.stream().map(Book::getName);
        stream.forEach(System.out::println);

    }
}
