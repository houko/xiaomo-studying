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
 * Date  : 2017/7/17 9:41
 * desc  : 简单工厂 (添加一个新的类型就要修改produce方法，违反了开闭原则)
 * Copyright(©) 2017 by xiaomo.
 */
public class EasyMessageFactory {

    public Sender produce(int type) {
        if (type == MessageType.MAIL) {
            return new MailSender();
        } else if (type == MessageType.SMS) {
            return new SmsSender();
        } else {
            return null;
        }
    }

    public interface MessageType {
        int SMS = 1;
        int MAIL = 2;
    }

    public static void main(String[] args) {
        EasyMessageFactory factory = new EasyMessageFactory();
        Sender sender = factory.produce(MessageType.MAIL);
        sender.send();
    }
}
