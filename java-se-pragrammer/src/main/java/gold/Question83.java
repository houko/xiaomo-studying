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
 * Date  : 2017/12/14 20:11
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question83 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        do {
            sum += num;

        } while (num-- > 1);
        System.out.println(sum);
    }
}
