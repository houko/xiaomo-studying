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
 * Date  : 2017/12/15 16:12
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Customer {
    private String firstname;

    private String lastname;

    private static int count;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        ++count;
    }

    static {
        count = 0;
    }

    public static int getCount() {
        return count;
    }
}
