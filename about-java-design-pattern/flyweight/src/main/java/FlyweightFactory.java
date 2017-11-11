import java.util.HashMap;
import java.util.Map;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 16:27
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();
    private Map<String, Flyweight> map = new HashMap<>();


    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    public Flyweight getFlyweight(String auth, String permit) {
        Flyweight flyweight = map.get(auth + "_" + permit);
        if (flyweight == null) {
            flyweight = new AuthFlyweight(auth, permit);
        }
        return flyweight;
    }


}
