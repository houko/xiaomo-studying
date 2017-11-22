/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/22 10:42
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question45 {

    public static void main(String[] args) {
        Question45 q = new Question45();
        int cardNo = 12344;
        q.checkCard(cardNo);  // line n2
//        q.readCard(cardNo); // line n3
    }

    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }
}
