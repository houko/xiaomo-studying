package gold;

import gold.bean.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
 * Date  : 2017/12/15 15:57
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question93 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("java me", "j", "hz"),
                new Student("java ee", "c", "sq"),
                new Student("java ee", "t", "d")
        );

        students.stream().collect(Collectors.groupingBy(Student::getCourse))
                .forEach((src, res) -> System.out.print(src));
    }
}
