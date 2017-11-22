/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/22 10:32
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question50 {
    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }

    private static String doMsg(char x) {
        return "Good Day!";
    }

    private static String doMsg(int y) {
        return "Good Luck!";
    }
}
