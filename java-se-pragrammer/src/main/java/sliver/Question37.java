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
 * Date    : 2017/11/16 17:36
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question37 {
    public static void main(String[] args) {
        int nums1[] = new int[3];
        int nums2[] = {1,2,3,4,5};
        nums1 = nums2;
        for (int i : nums1) {
            System.out.print(i + ":");
        }
    }
}
