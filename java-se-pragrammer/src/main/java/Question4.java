/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/13 17:50
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 * <p>
 * A: Jesse 25
 * Water 52
 * B: Compilation fails only at line n1
 * C: Compilation fails at line n2
 * D: Compilation fails at both line n1 and line n2
 * <p>
 * Answer: D
 */
public class Question4 {
    String name;
    int age = 25;

    public Question4(String name) {
        this();                   // line n1
        setName(name);
    }

    public Question4(String name, int age) {
        Question4(name);          // line n2
        setAge(age);
    }

    public static void main(String[] args) {
        Question4 one = new Question4("Jesse");
        Question4 two = new Question4("Walter", 52);
        System.out.println(one.show());
        System.out.println(two.show());
    }

    public String show() {
        return name + " " + age + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
