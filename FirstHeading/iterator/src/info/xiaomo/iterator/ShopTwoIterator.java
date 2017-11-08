package info.xiaomo.iterator;

import info.xiaomo.iterator.bean.MenuItem;

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
 * Date  : 2017/7/18 13:37
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class ShopTwoIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position;

    public ShopTwoIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position > menuItems.length || menuItems[position] == null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}
