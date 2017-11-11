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

    /**
     * get
     *
     * @return
     */
    String getUserId();

    /**
     * set
     *
     * @param userId
     */
    void setUserId(String userId);

    /**
     * get name
     *
     * @return
     */
    String getName();

    /**
     * set name
     *
     * @param name
     */
    void setName(String name);

    /**
     * get depId
     *
     * @return
     */
    String getDepId();


    /**
     * set depId
     *
     * @param id
     */
    void setDepId(String id);

    /**
     * get sex
     *
     * @return
     */
    String getSex();

    /**
     * sex
     *
     * @param sex
     */
    void setSex(String sex);

}
