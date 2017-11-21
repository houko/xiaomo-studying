/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/21 9:22
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question212 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.print(str1 == str2);
    }
}
