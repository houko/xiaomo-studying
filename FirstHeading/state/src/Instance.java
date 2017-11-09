
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
 * Date  : 2017/7/19 10:06
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Instance implements IInstance{

    private String name;

    private State state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void init() {

    }

    @Override
    public void waiting() {

    }

    @Override
    public void running() {

    }

    @Override
    public void closing() {

    }

    @Override
    public void closed() {

    }
}
