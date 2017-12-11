package gold;

import gold.bean.Address;
import gold.bean.Employee;

import java.util.Optional;

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
 * Date  : 2017/12/11 19:43
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question11 {
    public static void main(String[] args) {
        Address address = null;
        Optional<Address> address1 = Optional.ofNullable(address);
        Employee employee = new Employee(address1);
        String eAddress = address1.isPresent() ? address1.get().getCity() : "City not available";
        System.out.println(eAddress);
    }
}
