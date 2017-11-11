package module.impl;

import lombok.extern.slf4j.Slf4j;
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
 * Date    : 2017/11/9 14:51
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
@Slf4j
public class SoundCard extends AbstractColleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        log.info("开始播放声音:{}", data);
    }

}
