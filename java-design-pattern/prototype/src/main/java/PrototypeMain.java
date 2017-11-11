import business.impl.BusinessOrder;
import business.impl.PersonOrder;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 13:30
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Random random = new Random();
        PersonOrder personOrder = new PersonOrder();
        personOrder.setOrderNum(2301);
        personOrder.setCustomerName("小莫");
        personOrder.setProductId(String.valueOf(random.nextInt(1000000000)));
        OrderBusiness business = new OrderBusiness();
        business.saveOrder(personOrder);

        log.info("------------------------------------------------------------------------");


        BusinessOrder businessOrder = new BusinessOrder();
        businessOrder.setOrderNum(3201);
        businessOrder.setEnterpriseName("盛和网络");
        businessOrder.setProductId(String.valueOf(random.nextInt(1000000000)));
        OrderBusiness orderBusiness = new OrderBusiness();
        orderBusiness.saveOrder(businessOrder);
    }
}
