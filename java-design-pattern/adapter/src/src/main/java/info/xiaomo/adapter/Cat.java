package info.xiaomo.adapter;

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
 * Date  : 2017/7/17 20:34
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 * @author qq
 */
@Slf4j
public class Cat {

    public Cat() {
    }

    public void quake(){
        log.info("猫叫");
    }

    public void fly(){
        log.info("学鸭子飞");
    }

    public void display() {
        log.info("被叫过来充数的鸭子的猫");
    }
}
