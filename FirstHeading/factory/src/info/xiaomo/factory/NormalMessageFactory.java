package info.xiaomo.factory;

import info.xiaomo.factory.message.Sender;
import info.xiaomo.factory.message.impl.MailSender;
import info.xiaomo.factory.message.impl.SmsSender;

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
 * Date  : 2017/7/17 9:47
 * desc  : 普通/静态工厂模式 (每多一种类型就新加一个方法)
 * Copyright(©) 2017 by xiaomo.
 */
public class NormalMessageFactory {
    public static Sender produceSmsSender() {
        return new SmsSender();
    }

    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static void main(String[] args) {
        Sender mailSender = NormalMessageFactory.produceMailSender();
        mailSender.send();

        Sender smsSender = NormalMessageFactory.produceSmsSender();
        smsSender.send();

    }
}
