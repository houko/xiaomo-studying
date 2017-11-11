import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Date    : 2017/11/9 16:30
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class SecurityMgr {
    private static SecurityMgr ourInstance = new SecurityMgr();
    private Map<String, List<Flyweight>> map = new HashMap<>();

    private SecurityMgr() {
    }

    public static SecurityMgr getInstance() {
        return ourInstance;
    }

    public void login(String user) {
        List<Flyweight> list = queryUser(user);
        map.put(user, list);
    }

    private List<Flyweight> queryUser(String user) {
        List<Flyweight> col = new ArrayList<>();
        Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight("xiaomo", "xiaomo");
        col.add(flyweight);
        return col;
    }


    /**
     * 判断是否有权限
     *
     * @param user           user
     * @param securityEntity securityEntity
     * @param permit         permit
     * @return boolean
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        List<Flyweight> flyweights = map.get(user);
        if (flyweights == null || flyweights.isEmpty()) {
            return false;
        }
        for (Flyweight flyweight : flyweights) {
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

}
