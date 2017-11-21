/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/21 10:22
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question228 {
    class Sports {
        int num_players;
        String name, ground_condition;

        public Sports(int np, String sname, String sground) {
            this.num_players = np;
            this.name = sname;
            this.ground_condition = sground;
        }
    }

    class Cricket extends Sports {
        int num_umpires;
        int num_substitutes;

        public Cricket() {
            super(11, "11", "1");
        }
    }
}
