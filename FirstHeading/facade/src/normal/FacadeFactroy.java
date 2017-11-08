package normal;

import normal.impl.FacadeOneImpl;
import normal.impl.FacadeTwoImpl;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/8 14:48
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class FacadeFactroy {

    public static IFacade getFacade(int type) {
        if (type == FacadeType.ONE) {
            return new FacadeOneImpl();
        } else if (type == FacadeType.TWO) {
            return new FacadeTwoImpl();
        }
        return null;
    }


    interface FacadeType {
        int ONE = 1;
        int TWO = 2;
    }


}
