package gold;

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
 * Date  : 2017/12/14 16:06
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question68 {
    public static String doMsg(char x) {
        return "Good Day!";
    }

    public static String doMsg(int x) {
        return "Good Luck!";
    }

    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
    }
}
