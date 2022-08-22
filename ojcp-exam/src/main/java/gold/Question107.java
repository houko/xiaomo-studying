package gold;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
 * Date  : 2017/12/16 15:18
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question107 {
    public static void main(String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("G:/data.txt"))) {
            br.lines().forEach(System.out::println);
            brCopy = br;

        }
        boolean ready = brCopy.ready();
    }
}
