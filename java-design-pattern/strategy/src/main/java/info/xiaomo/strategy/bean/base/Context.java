package info.xiaomo.strategy.bean.base;

import info.xiaomo.strategy.behavior.operate.Operate;
import lombok.extern.slf4j.Slf4j;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 11:29
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
@Slf4j
public class Context {
    protected Operate operate;

    public Context(Operate operate) {
        this.operate = operate;
    }

    public void count(int a, int b) {
        int i = operate.doOperate(a, b);
        log.info("{}", i);
    }

}
