/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/22 17:19
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question154 {
    public static void main(String[] args) {
        float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.4f;
        while (index < 5) {
            if (key == myarray[index]) {
                isFound = true;
                break;
            }
            index++;
        }
        System.out.println(isFound);
    }
}
