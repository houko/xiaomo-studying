package gold;

import java.util.function.ToIntFunction;

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
 * Date  : 2017/12/14 16:48
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question76 {
    public static void main(String[] args) {
        String str = "java is a programming language";
        ToIntFunction<Integer> indexVal = str::indexOf;
        int x = indexVal.applyAsInt(Integer.valueOf("Java"));
        System.out.println(x);
    }
}
