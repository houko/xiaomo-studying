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
 * Date    : 2017/11/15 20:25
 * desc    : AC
 * Copyright(©) 2017 by xiaomo.
 */
public class Question09 {
    public static void main(String[] args) {
        double discount = 0;
        int qty = Integer.parseInt(args[0]);
        // line 1
        // ✑ If the value of the qty variable is greater than or equal to 90, discount = 0.5
        // ✑ If the value of the qty variable is between 80 and 90, discount = 0.2

    }

    // A: if(qty>90){discount =0.5;}
    //    if(qty>80 && qty<90){discount=0.2}
    // 假设为 qty = 91 discount = 0.5;假设qty=81,discount=0.2  符合要求

    // B: discount = (qty>90?0.5:0);
    //    discount = (qty>80)?0.5:0;
    // 假设qty=91 discount=0; 假设qty=81 discount discount=0.2  不符合要求

    // C: discount = (qty>=90) ?0.5: (qty>80)?0.2:0
    // 假设为 qty = 91 discount = 0.5;假设qty=81,discount=0.2  符合要求

    // D: if (qty>80 && qty<=90){discount = 0.2} else {discount =0}
    //    if (qty>=90){discount=0.5} else {discount =0 }
    // 假设qty=91 discount=0.5; 假设qty=81  discount=0 不符合要求

    // E: discount = (qty>80)?0.2 :(qty>=90)?0.5:0
    // 假设qty=91 discount=0.2; 假设qty=81 discount =0.2不符合要求
}
