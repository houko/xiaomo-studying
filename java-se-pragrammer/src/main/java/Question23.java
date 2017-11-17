/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/16 15:55
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question23 {
    public static void main(String[] args) {
        try {
            String [] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";

            for (String s : arr) {
                System.out.print(s +" ");
            }
        } catch (Exception e){
            System.out.println(e.getClass());
        }
        // null Unix Linux Solarios
    }
}
