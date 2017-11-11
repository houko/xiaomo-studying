package proxy;

import lombok.extern.slf4j.Slf4j;
import model.UserModel;
import user.UserModelApi;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 15:19
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class UserProxy implements UserModelApi {

    private UserModel userModel = null;

    private boolean loaded = false;

    public UserProxy(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public String getUserId() {
        return userModel.getDepId();
    }

    @Override
    public void setUserId(String userId) {
        userModel.setDepId(userId);
    }

    private void reload() {
        log.info("重新查询数据库获取完整的数据");
        loaded = true;
    }

    @Override
    public String getName() {
        return userModel.getName();
    }

    @Override
    public void setName(String name) {
        userModel.setName(name);
    }

    @Override
    public String getDepId() {
        if (!this.loaded) {
            reload();
        }
        return userModel.getDepId();
    }

    @Override
    public void setDepId(String id) {
        userModel.setDepId(id);
    }

    @Override
    public String getSex() {
        if (!this.loaded) {
            reload();
        }
        return userModel.getSex();
    }

    @Override
    public void setSex(String sex) {
        userModel.setSex(sex);
    }

    @Override
    public String toString() {
        return "UserProxy{" +
                "userModel=" + userModel +
                ", loaded=" + loaded +
                '}';
    }
}
