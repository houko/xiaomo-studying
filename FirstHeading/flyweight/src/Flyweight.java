/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 16:23
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public interface Flyweight {

    /**
     * 判断是否有权限执行某个操作
     *
     * @param securityEntity securityEntity
     * @param permit         permit
     * @return boolean
     */
    boolean match(String securityEntity, String permit);

}
