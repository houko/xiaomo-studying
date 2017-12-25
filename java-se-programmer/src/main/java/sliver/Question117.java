package sliver;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/22 14:08
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question117 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duck");
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.println(str1 == str2);
    }
}
