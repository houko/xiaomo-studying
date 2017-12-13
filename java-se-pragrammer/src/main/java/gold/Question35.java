package gold;

import gold.bean.CourseFilter;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
 * Date  : 2017/12/13 20:15
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question35 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
        Predicate<String> cf1 = s -> s.length() > 3;
        Predicate cf2 = new CourseFilter() {
            public boolean test(String s) {
                return s.contains("Java");
            }
        };
        long c = strs.stream().filter(cf1).filter(cf2).count();
        System.out.println(c);
    }

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
     * Date  : 2017/12/13 20:56
     * desc  :
     * Copyright(©) 2017 by xiaomo.
     */
    public static class Question46 {
        public static void main(String[] args) {
            LocalDate date = LocalDate.of(2015, Month.FEBRUARY,14);
            LocalDate nextYear = date.plusYears(1);
            nextYear.plusDays(15);
            System.out.println(nextYear);
        }
    }
}
