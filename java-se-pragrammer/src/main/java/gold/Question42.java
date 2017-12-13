package gold;

import java.time.LocalDate;
import java.time.Month;

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
 * Date  : 2017/12/13 20:34
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question42 {
    static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
        if (Math.random() > -1) {
            throw new Exception("Try Again");
        }

    }

    public static void main(String[] args) {
        try {
            doStuff();
            LocalDate.of(2015, Month.FEBRUARY,14);
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
