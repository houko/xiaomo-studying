package gold;

import gold.bean.AnotherSamleClass;
import gold.bean.SampleClass;

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
 * Date  : 2017/12/14 20:35
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question89 {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        AnotherSamleClass asc = new AnotherSamleClass();
        sc = asc;
        System.out.println("sc:" + sc.getClass());
        System.out.println("asc:" + asc.getClass());

    }
}
