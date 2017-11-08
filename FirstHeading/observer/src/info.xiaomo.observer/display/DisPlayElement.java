package info.xiaomo.observer.display;


import java.util.Observer;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiamoo.info
 * QQ    : 83387856
 * Date  : 17/6/15 10:44
 * desc  : 展示接口
 * Copyright(©) 2017 by xiaomo.
 */
public interface DisPlayElement extends Observer {

    void display();

}
