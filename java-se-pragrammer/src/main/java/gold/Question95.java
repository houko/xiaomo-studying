package gold;

import gold.bean.Customer;

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
public class Question95 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("", "");
        Customer customer2 = new Customer("", "");
        Customer customer3 = new Customer("", "");
        Customer customer4 = new Customer("", "");
        customer4 = null;
        customer3 = customer2;
        System.out.println(Customer.getCount());
    }
}
