import user.UserModelApi;

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
 * Date    : 2017/11/9 15:27
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class ProxyMain {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        List<UserModelApi> modelApis = userManager.getUserByDepId("83387856");
        for (UserModelApi modelApi : modelApis) {
            System.out.println(modelApi.getDepId());
            System.out.println(modelApi.getName());
            System.out.println(modelApi.getSex());
            System.out.println(modelApi.getUserId());
        }
    }
}
