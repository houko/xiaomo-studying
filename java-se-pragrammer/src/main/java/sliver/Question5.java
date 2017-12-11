package sliver;

import sliver.bean.Mid;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/14 11:50
 * desc    :
 * Which two code fragments, when inserted at // insert code here enable the code to compile and print 12?
 * Answer:AC
 * Copyright(©) 2017 by xiaomo.
 */
public class Question5 extends Mid {

    public static void main(String[] args) {
        int n1 = 22, n2 = 2;
        // 插入代码
//        System.out.println(n3);
    }

    // A: Question5 q = new Question5(); n3 = q.findMid(n1,n2)   //  12
    // B: int n3 = super.findMid(n1,n3);   // 编译错误(定义重复，在静态方法中调用非静态方法)
    // C. Question5 c = new Mid(); int n3 = c.findMid(n1, n2);  // 12
    // D. Mid m1 = new Question5(); int 	n3 = m1.findMid(n1, n2);   // 父子关系颠倒
    // E. int n3 = Question5.findMid(n1, n2);   // 编译错误
}
