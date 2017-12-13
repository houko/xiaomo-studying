package gold.bean;

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
 * Date  : 2017/12/13 19:42
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Candidate {

    String name;

    int age;

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age >= 150 || age <= 10) {
            throw new AgeOutOfRangeException();
        } else {
            this.name = name;
            this.age = age;
        }


    }
}
