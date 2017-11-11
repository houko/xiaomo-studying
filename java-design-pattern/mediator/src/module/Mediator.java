package module;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 14:40
 * desc    : 中介者（主板）
 * Copyright(©) 2017 by xiaomo.
 */
public interface Mediator {

    /**
     * 同事对象在自身改变的时候通知中介者，让中介者去和其他同事进行交互
     *
     * @param colleague colleague
     */
    void changed(AbstractColleague colleague);

}
