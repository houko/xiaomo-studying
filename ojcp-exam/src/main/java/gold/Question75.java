package gold;

import java.util.TreeMap;

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
 * Date  : 2017/12/14 16:46
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question75 {
    // 有序的。。。。。。。。。。。
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1007, "A");
        treeMap.put(1002, "C");
        treeMap.put(1001, "B");
        treeMap.put(1003, "B");
        System.out.println(treeMap);
    }
}
