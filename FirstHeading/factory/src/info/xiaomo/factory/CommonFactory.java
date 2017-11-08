package info.xiaomo.factory;

import info.xiaomo.factory.message.Sender;
import info.xiaomo.factory.message.impl.MailSender;
import info.xiaomo.factory.message.impl.SmsSender;

import java.util.HashMap;
import java.util.Map;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 10:03
 * desc  : 我平时常用的工厂模式(同样违反了开闭原则)
 * Copyright(©) 2017 by xiaomo.
 */
public class CommonFactory {
    private static Map<MessageType, Sender> senders = new HashMap<>();

    static {
        senders.put(MessageType.MAIL, new MailSender());
        senders.put(MessageType.SMS, new SmsSender());
    }

    public static Sender getSender(MessageType type) {
        return senders.get(type);
    }

    public enum MessageType {
        MAIL(1),
        SMS(2);

        private int type;

        MessageType(int type) {
            this.type = type;
        }

        public static MessageType parse(int type) {
            for (MessageType messageType : values()) {
                if (type == messageType.getType()) {
                    return messageType;
                }
            }
            return null;
        }

        public int getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        Sender sender = CommonFactory.getSender(MessageType.parse(1));
        sender.send();
    }
}
