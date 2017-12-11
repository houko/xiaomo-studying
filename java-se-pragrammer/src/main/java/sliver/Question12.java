package sliver;

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
 * Date    : 2017/11/21 17:38
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question12 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        Patient p = new Patient("Mike");
        int f = ps.indexOf(p2);

        if (f >= 0) {
            System.out.println("Mike Found");
        }

    }

    static class Patient {
        String name;

        public Patient(String name) {
            this.name = name;
        }
    }
}
