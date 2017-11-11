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
 * Date    : 2017/11/9 14:49
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Cpu extends AbstractColleague {

    private String videoData = "";

    private String soundData = "";


    public Cpu(Mediator mediator) {
        super(mediator);
    }


    /**
     * 执行数据
     *
     * @param data data
     */
    public void executeData(String... data) {
        this.videoData = data[0];
        this.soundData = data[1];
        // 通知主板
        this.getMediator().changed(this);
    }

    public String getVideoData() {
        return videoData;
    }

    public void setVideoData(String videoData) {
        this.videoData = videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void setSoundData(String soundData) {
        this.soundData = soundData;
    }

}
