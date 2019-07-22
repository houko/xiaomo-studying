package info.xiaomo.robredpackage;

import java.util.Random;

/***
 * 设计抢红包系统，100元分成10份，100个来抢，怎么设计
 */
public class RobRedPackageMain {
    public static void main(String[] args) {
        Random random = new Random();
        int all = 100;
        int leftMoney = all;
        int money = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                money = leftMoney;
            }
            money = random.nextInt(leftMoney);
            leftMoney -= money;
            System.out.println(money);
        }
    }


}
