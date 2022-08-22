package gold;

import java.nio.file.Path;
import java.nio.file.Paths;

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
 * Date  : 2017/12/16 10:47
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question101 {
    public static void main(String[] args) {
        Path path = Paths.get("/Pic/a.jpeg");
        System.out.println(path.getNameCount() + "." + path.getName(1) + "." + path.getFileName());
    }
}
