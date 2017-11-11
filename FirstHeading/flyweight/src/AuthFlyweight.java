/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 16:24
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class AuthFlyweight implements Flyweight {

    private String securityEntity;

    private String permit;

    public AuthFlyweight(String securityEntity, String permit) {
        this.securityEntity = securityEntity;
        this.permit = permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity)
                && this.permit.equals(permit);
    }
}
