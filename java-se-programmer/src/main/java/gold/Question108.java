package gold;

import gold.bean.Foo;

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
 * Date  : 2017/12/16 15:23
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question108 {
    public static void main(String[] args) {
        Foo<String, Integer> steve = new Foo<String, Integer>("Steve", 100);
        Foo<String, String> hello_world = Foo.<String>twice("Hello World");
        Foo<?, ?> foo = new Foo<>(97, 32);
        Foo<String, String> stringFoo = new Foo<>("John", "A");

    }
}
