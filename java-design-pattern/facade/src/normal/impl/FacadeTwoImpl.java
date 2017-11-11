package normal.impl;

import genereate.GenerateMessage;
import genereate.GenerateProtocol;
import normal.IFacade;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/8 14:47
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class FacadeTwoImpl implements IFacade {
    @Override
    public void generate() {
        GenerateMessage message = new GenerateMessage();
        message.generete();
        GenerateProtocol protocol = new GenerateProtocol();
        protocol.generate();
    }
}
