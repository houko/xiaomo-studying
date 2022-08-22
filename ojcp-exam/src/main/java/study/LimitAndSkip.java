package study;

import study.bean.Person;

import java.util.ArrayList;
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
 * Date  : 2017/12/22 16:28
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class LimitAndSkip {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Person person = new Person(i, "name" + i);
            personList.add(person);
        }
        List<String> personList2 = personList.stream()
                .map(Person::getName)
                .limit(10)
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(personList2);
    }
}
