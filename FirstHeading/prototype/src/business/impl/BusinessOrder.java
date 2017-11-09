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
 * Date    : 2017/11/9 13:36
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class BusinessOrder implements IOrder {
    private String enterpriseName;
    private String productId;
    private int orderNum;


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
        BusinessOrder order = new BusinessOrder();
        order.setEnterpriseName(enterpriseName);
        order.setOrderNum(orderNum);
        order.setProductId(productId);
        return order;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BusinessOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
