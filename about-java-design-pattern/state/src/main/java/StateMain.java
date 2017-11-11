import vote.VoteManager;

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
 * Date  : 2017/7/18 17:59
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class StateMain {
    public static void main(String[] args) {

        // 只有把他做成一个web应用 启动起来之后才能正常使用
        // 否则执行一次则关掉应用每次都会显示投票成功
        VoteManager.getInstance().vote("小莫", "123");
    }
}
