package info.xiaomo.factory.message.impl;

import info.xiaomo.factory.message.Sender;
import lombok.extern.slf4j.Slf4j;

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
 * Date  : 2017/7/17 9:39
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class MailSender implements Sender {
    @Override
    public void send() {
        log.info("用邮件发送消息");
    }
}
