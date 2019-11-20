package gold;

import java.io.File;

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
 * Date  : 2017/12/12 10:17
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question15 {
    public void recDelete(String dirName) {
        File[] lstOfFiles = new File(dirName).listFiles();
        if (lstOfFiles != null && lstOfFiles.length > 0) {
            for (File lstOfFile : lstOfFiles) {
                if (lstOfFile.isDirectory()) {
                    recDelete(lstOfFile.getAbsolutePath());
                } else {
                    if (lstOfFile.getName().endsWith(".class")) {
                        lstOfFile.delete();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Question15 q = new Question15();
        q.recDelete("G:\\test");
    }
}
