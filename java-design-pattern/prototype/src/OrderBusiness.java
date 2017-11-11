import business.IOrder;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 13:29
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class OrderBusiness {
    private static final int MAX_ORDER_COUNT = 1000;

    public void saveOrder(IOrder order) {
        // 当订单大于指定数量时进行拆分
        while (order.getOrderNum() > MAX_ORDER_COUNT) {
            IOrder newOrder = order.cloneOrder();
            newOrder.setOrderNum(MAX_ORDER_COUNT);
            // 老的订单减去订单数量
            order.setOrderNum(order.getOrderNum() - MAX_ORDER_COUNT);
            System.out.println("拆分订单：" + newOrder);
        }
        System.out.println("订单：" + order);
    }

}
