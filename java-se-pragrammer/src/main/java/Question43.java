import bean.A;
import bean.B;
import bean.C;

import java.util.ArrayList;
import java.util.List;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/16 17:55
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question43 {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
        list.add(new C());
        for (A a : list) {
            System.out.println(a.doStuff("Java"));
        }
    }
}
