/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/22 14:17
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question120 {
    public static void main(String[] args) {
        String str1= "Java";
        char str2[] = {'J','a','v','a'};
        String str3 = null;
        for (char c : str2) {
            str3 = str3 + c;
        }
        if (str1.equals(str3))
            System.out.println("Successful");
        else
            System.out.println("Unsuccessful");
    }
}
