package info.xiaomo.factory;

import info.xiaomo.factory.factory.MailFactory;
import info.xiaomo.factory.message.Sender;

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
 * Date  : 2017/7/17 9:58
 * desc  : 抽象工厂
 * Copyright(©) 2017 by xiaomo.
 */
public class AbstractMessageFactory {
    public static void main(String[] args) {
        MailFactory mailFactory = new MailFactory();
        Sender produce = mailFactory.produce();
        produce.send();
    }

}
