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
 * Date  : 2017/12/21 17:06
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Folder implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("close");
    }

    public void open(){
        System.out.println("Open");
    }
}
