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
 * Date    : 2017/11/16 17:47
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question40 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        for (String[] shirt : shirts) {
            for (String s : shirt) {
                System.out.print(s + ":");
            }
        }
    }
}
