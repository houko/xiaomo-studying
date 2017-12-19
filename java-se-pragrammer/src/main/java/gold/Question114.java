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
 * Date  : 2017/12/19 19:04
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question114 {
    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "RD":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "No interest for this account";
        }
        System.out.println("Rate of interest" + rateOfInterest);
    }
}
