package gold;

import gold.bean.Product;

import java.util.Arrays;
import java.util.List;

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
 * Date  : 2017/12/12 10:59
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question19 {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, 10),
                new Product(2, 30),
                new Product(2, 30)
        );
        Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
            p1.price += p2.price;
            return new Product(p1.id, p1.price);
        });

        products.add(p);
        products.stream().parallel().reduce((p1, p2) -> p1.price > p2.price ? p1 : p2).ifPresent(System.out::println);
    }
}
