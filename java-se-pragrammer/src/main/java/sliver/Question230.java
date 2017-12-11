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
 * Date    : 2017/11/21 12:17
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question230 {
    public static void main(String[] args) {
        String[] str = {"A","B","C","D"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
            if (str[i].equals("C")){
                continue;
            }
            System.out.println("Work done");
            break;
        }

            StringBuilder sb = new StringBuilder();
    }
}
