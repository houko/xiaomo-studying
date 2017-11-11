package simple;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/8 14:32
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class FacadeMain {

    public static void main(String[] args) {
        // 调用facade的方法即可,至于里面的业务交给facade去完成
        Facade.generate();
    }
}
