package gold;

import java.util.Arrays;
import java.util.List;

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
 * Date  : 2017/12/19 19:08
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question116 {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList("DOC", "MPEG", "JPEG");
        codes.forEach(System.out::print);

        String fmt = codes.stream().filter(s -> s.contains("PEG"))
                .reduce((s, t) -> s + t).get();

        System.out.println("\n" + fmt);

    }
}
