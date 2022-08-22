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
 * Date    : 2017/11/16 16:35
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question25 {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arr[] = {1, 3, 5, 7,8, 9};
        int index = arr.length;
        while (index > 0) {
            if (arr[index - 1] % 2 == 0) {
                isChecked = true;
            }
            --index;
        }
        System.out.println(arr[index] + "," + isChecked);
    }
}
