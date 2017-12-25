package gold;

import gold.bean.Concat;
import gold.bean.Sub;
import gold.bean.Super;

import java.util.ArrayList;
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
 * Date  : 2017/12/19 0:41
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question113 {
    public static void main(String[] args) {
        List objs = new ArrayList();
        Concat c1 = new Super();
        Concat c2 = new Sub();
        Super s1 = new Sub();
        objs.add(c1);
        objs.add(c2);
        objs.add(s1);
        for (Object obj : objs) {
            System.out.println(obj.getClass().getSimpleName());
        }
    }
}
