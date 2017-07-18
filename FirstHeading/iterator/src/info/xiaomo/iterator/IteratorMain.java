package info.xiaomo.iterator;

import info.xiaomo.iterator.bean.MenuItem;
import info.xiaomo.iterator.bean.ShopOneMenu;
import info.xiaomo.iterator.bean.ShopTwoMenu;

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
 * Date  : 2017/7/18 13:31
 * desc  : 迭代器模式
 * Copyright(©) 2017 by xiaomo.
 */
public class IteratorMain {
    public static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }

    public static void printMenu(){
        ShopOneMenu shopOneMenu = new ShopOneMenu();
        Iterator iterator = shopOneMenu.createIterator();
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }

    }

    public static void main(String[] args) {
        ShopTwoMenu twoMenu = new ShopTwoMenu();
        Iterator iterator = twoMenu.createIterator();
        printMenu(iterator);


        printMenu();
    }
}
