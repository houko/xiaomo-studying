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
 * Date  : 2017/12/16 17:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question127 {

    static void dispResult(int[] num){
        try {
            System.out.println(num[1]/(num[1]-num[2]));
        } catch (Exception e) {
            System.err.print("first exception");
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        try {
            int[] arr = {100,200};
            dispResult(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
