package gold;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

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
 * Date  : 2017/12/16 10:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question99 {
    public static void main(String[] args) {
        Stream<Path> paths = Stream.of(Paths.get("G:/data.doc"));
        Paths.get("G/data.txt");
        Paths.get("G/data.xml");
        paths.filter(s -> s.toString().endsWith("txt")).forEach(s -> {
            try {
                Files.readAllLines(s).stream().forEach(System.out::println);
            } catch (IOException e) {

            }
        });


    }
}
