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
 * Date    : 2017/11/22 17:46
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question176 {
    String myStr = "7007";

    public void doStuff(String str){
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch ( NumberFormatException ex){

        }
        System.out.println(myStr + " " + myNum);
    }

    public static void main(String[] args) {
        Question176 q = new Question176();
        q.doStuff("9009");
    }
}
