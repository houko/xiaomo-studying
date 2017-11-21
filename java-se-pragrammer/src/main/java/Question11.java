/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/21 16:48
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question11 {
    public static void main(String[] args) {
        int row = 10;
        for (; row > 0; ) {
            int col = row;
            while (col >= 0) {
                System.out.print(col + " ");
                col -= 2;
            }
            row = row / col;
        }
    }
}
