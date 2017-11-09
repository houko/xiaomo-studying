package user;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 15:17
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public interface UserModelApi {
    String getUserId();

    void setUserId(String userId);

    String getName();

    void setName(String name);

    String getDepId();

    void setDepId(String id);

    String getSex();

    void setSex(String sex);

}
