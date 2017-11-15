/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/15 19:58
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question7 {
    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int sum = 0;
        for (int frnt = 0, real = lst.length - 1; frnt < 5 && real >= 5; frnt++, real--) {
            sum = sum + lst[frnt] + lst[real];
        }
        System.out.println(sum);   // 20
    }
}
