package info.xiaomo.state;

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
 * Date  : 2017/7/18 17:59
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public enum State {
    /**
     * 等待玩家进入
     */
    WAITING,

    /**
     *  执行初始化操作
     */
    INIT,

    /**
     * 副本进行中
     */
    RUNNING,

    /**
     *  处理副本结束逻辑(发奖什么的)，并且等待结束倒计时
     */
    CLOSING,

    /**
     * 副本结束，并且执行副本销毁逻辑
     */
    CLOSED,
}
