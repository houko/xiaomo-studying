package info.xiaomo.robredpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/***
 * 设计抢红包系统，100元分成10份，100个来抢，怎么设计
 */
public class RobRedPackageMain {
    //发红包算法，金额参数以分为单位
    public static List<Integer> divideRedPackage(Integer totalAmount, Integer totalPeopleNum) {
        List<Integer> amountList = new ArrayList<Integer>();
        Integer restAmount = totalAmount;
        Integer restPeopleNum = totalPeopleNum;
        Random random = new Random();
        for (int i = 0; i < (totalPeopleNum - 1); i++) {
            //随机范围：[1，剩余人均金额的两倍)，左闭右开
            int amount = random.nextInt((restAmount / restPeopleNum * 2) - 1) + 1;
            restAmount -= amount;
            restPeopleNum--;
            amountList.add(amount);
        }
        amountList.add(restAmount);
        return amountList;
    }
    public static void main(String[] args) {
        List<Integer> amountList = divideRedPackage(5000, 30);
        for (Integer amount : amountList) {
            System.out.println("抢到金额：" +
                    new BigDecimal(amount).divide(new BigDecimal(100)));
        }
    }
}
