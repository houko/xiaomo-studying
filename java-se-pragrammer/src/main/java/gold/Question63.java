package gold;

import gold.bean.Alpha;
import gold.bean.Beta;
import gold.bean.Gamma;

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
 * Date  : 2017/12/14 15:15
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question63 {
    public static void main(String[] args) {
        List<Alpha> strs = new ArrayList<>();
        strs.add(new Alpha());
        strs.add(new Beta());
        strs.add(new Gamma());
        for (Alpha str : strs) {
            System.out.println(str.doStuff("Java"));
        }
    }
}
