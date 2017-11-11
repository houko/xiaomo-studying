import model.UserModel;
import proxy.UserProxy;
import user.UserModelApi;

import java.util.ArrayList;
import java.util.List;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 15:24
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class UserManager {

    /**
     * 根据部门Id获取该部门下所有员工
     *
     * @param depId depId
     * @return List<UserModelApi>
     */
    public List<UserModelApi> getUserByDepId(String depId) {
        List<UserModelApi> userModelApis = new ArrayList<>();
        // 模拟从数据查找数据
        UserProxy proxy1 = new UserProxy(new UserModel());
        proxy1.setDepId(depId);
        proxy1.setName("小莫");
        proxy1.setSex("男");
        proxy1.setUserId("123");
        UserProxy proxy2 = new UserProxy(new UserModel());
        proxy2.setDepId(depId);
        proxy2.setName("小明");
        proxy2.setSex("男");
        proxy2.setUserId("452323");
        userModelApis.add(proxy1);
        userModelApis.add(proxy2);
        return userModelApis;
    }

}
