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
 * Date    : 2017/11/13 16:52
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question01 {

    static int count = 0;
    int i = 0;

    public static void main(String[] args) {
        Question01 one = new Question01();
        Question01 two = new Question01();
        one.changeCount();
        two.changeCount();
        System.out.println(one.count + ":" + two.count);
        // 10:10
    }

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }
}
