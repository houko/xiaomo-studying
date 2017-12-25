package gold;

import java.io.FileInputStream;
import java.io.InputStreamReader;

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
 * Date  : 2017/12/9 14:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question02 {
    public static void main(String[] args) {
        int i;
        char c;
        try {
            FileInputStream fis = new FileInputStream("G:\\IdeaProject\\BookNote\\java-se-pragrammer\\src\\main\\java\\gold\\course.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            {
                while (isr.ready()) {
                    isr.skip(2);
                    i = isr.read();
                    c = (char) i;
                    System.out.print(c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
