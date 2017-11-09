package module.impl;

import module.AbstractColleague;
import module.Mediator;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 14:47
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class CdDriver extends AbstractColleague {

    private String[] data;

    public CdDriver(Mediator mediator) {
        super(mediator);
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public void readCd() {
        this.data = new String[]{"葫芦娃 ", "嗯嗯啊啊"};
        this.getMediator().changed(this);
    }
}
