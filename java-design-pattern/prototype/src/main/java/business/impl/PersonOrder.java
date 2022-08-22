package business.impl;

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
 * Date    : 2017/11/9 13:27
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class PersonOrder implements IOrder {

    private String customerName;

    private String productId;

    private int orderNum = 0;

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(int num) {
        orderNum = num;
    }

    @Override
    public IOrder cloneOrder() {
        PersonOrder personOrder = new PersonOrder();
        personOrder.setProductId(productId);
        personOrder.setOrderNum(orderNum);
        personOrder.setCustomerName(customerName);
        return personOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PersonOrder{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
