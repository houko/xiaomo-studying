import java.util.ArrayList;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/22 13:18
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question113 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true){
                myList.add("My String");
            }
        } catch (RuntimeException e){
            System.out.println("Caught a RuntimeException");
        } catch (Exception ex){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
