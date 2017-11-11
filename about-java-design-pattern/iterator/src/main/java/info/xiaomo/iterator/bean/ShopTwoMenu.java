package info.xiaomo.iterator.bean;

import info.xiaomo.iterator.Iterator;
import info.xiaomo.iterator.ShopTwoIterator;
import lombok.extern.slf4j.Slf4j;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/18 13:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class ShopTwoMenu {
    private static final int MAX_COUNT = 6;

    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public ShopTwoMenu() {
        menuItems = new MenuItem[MAX_COUNT];
        addItem("黄瓜", "生的", 1);
    }

    public void addItem(String name, String desc, double price) {
        MenuItem menuItem = new MenuItem(name, desc, price);
        if (numberOfItems > MAX_COUNT) {
            log.info("isFull");
            return;
        }
        menuItems[numberOfItems] = menuItem;
        numberOfItems += 1;

    }

    public Iterator createIterator() {
        return new ShopTwoIterator(menuItems);
    }
}
