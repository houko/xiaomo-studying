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
 * Date    : 2017/11/20 18:34
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Alpha2 {
    public String[] main = new String[2];

    public Alpha2(String[] main) {
        for (int i = 0; i < main.length; i++) {
            this.main[i] = main[i] + 5;
        }
    }

    public void main() {
        System.out.println(main[0] + main[1]);
    }
}
