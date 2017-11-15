package bean;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/15 21:00
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Alpha {
    static int s;
    int ns;

    public Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    public void doPrint() {
        System.out.println("ns = " + ns + "  s = " + s);
    }

}
