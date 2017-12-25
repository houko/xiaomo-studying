package gold;

import gold.bean.Book;

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
 * Date  : 2017/12/14 9:52
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question49 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "java");
        Book b2 = new Book(2, "java");
        System.out.println(b1.equals(b2));
    }
}
