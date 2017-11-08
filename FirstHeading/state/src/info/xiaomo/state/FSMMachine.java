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
 * Date  : 2017/7/18 18:01
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class FSMMachine implements Runnable {
    private Instance instance;
    private State state;

    public FSMMachine() {
        instance = new Instance();
        instance.setName("测试");
        instance.setState(State.INIT);
        this.state = instance.getState();
    }


    @Override
    public void run() {
        switch (state) {
            case WAITING:
                break;
            case INIT:
                break;

            case RUNNING:
                break;
            case CLOSING:
                break;
            case CLOSED:
                break;
            default:
                break;
        }
    }
}
