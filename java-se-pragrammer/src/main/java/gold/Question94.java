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
 * Date  : 2017/12/15 16:09
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question94 {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7, 9};
        arr2 = arr1;
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
