package business;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 13:26
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public interface IOrder {

    /**
     * 获得订单数量
     *
     * @return int
     */
    int getOrderNum();

    /**
     * 设置订单数量
     *
     * @param num num
     */
    void setOrderNum(int num);

    /**
     * clone自身的接口
     *
     * @return IOrder
     */
    IOrder cloneOrder();

}
