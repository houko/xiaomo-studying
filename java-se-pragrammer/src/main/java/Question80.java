/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/20 17:42
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question80 {
    int favr;
    static int cvar;

    public static void main(String[] args) {
        Question80 t = new Question80();
        t.favr = 200;
        cvar = 400;
        t.favr = 200;
        Question80.cvar = 400;

    }
}
