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
 * Date    : 2017/11/9 14:57
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class VideoCard extends AbstractColleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("开始播放视频：" + data);
    }
}
