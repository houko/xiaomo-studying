package info.xiaomo.iterator.bean;

import info.xiaomo.iterator.Iterator;
import info.xiaomo.iterator.ShopOneIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/18 13:36
 * desc  : 商店一
 * Copyright(©) 2017 by xiaomo.
 */
public class ShopOneMenu {
    private List<MenuItem> menuItems = new ArrayList<>();

    public ShopOneMenu() {
       addItem("白菜","大的",1);
    }

    public void addItem(String name, String desc, double price){
        MenuItem menuItem = new MenuItem(name,desc,price);
        menuItems.add(menuItem);
    }



    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator() {
        return new ShopOneIterator(menuItems);
    }
}
