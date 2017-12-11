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
 * Date    : 2017/11/21 8:29
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question195 {
    public static void main(String[] args) {
        int var1 = -5;
        int var2 = var1--;
        int var3 = 0;
        if (var2<0){
            var3 = var2++;
        } else {
            var3 = --var2;
        }
        System.out.println(var3);
    }
}
