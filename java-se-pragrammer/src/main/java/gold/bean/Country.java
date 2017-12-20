package gold.bean;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/12/20 16:37
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Country {
    String name;
    Continent region;


    public Country(String name, Continent region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getRegion() {
        return region;
    }

    public void setRegion(Continent region) {
        this.region = region;
    }
}
