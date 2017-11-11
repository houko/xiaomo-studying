package module;

import module.impl.CdDriver;
import module.impl.Cpu;
import module.impl.SoundCard;
import module.impl.VideoCard;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/9 14:46
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class MainBoard implements Mediator {

    private CdDriver cdDriver = null;

    private SoundCard soundCard = null;

    private Cpu cpu = null;

    private VideoCard videoCard = null;


    @Override
    public void changed(AbstractColleague colleague) {
        if (colleague == cdDriver) {
            this.openCdDriverReadData((CdDriver) colleague);
        } else if (colleague == cpu) {
            this.openCpu((Cpu) colleague);
        }
    }


    /**
     * 读取数据并传给cpu
     *
     * @param driver driver
     */
    private void openCdDriverReadData(CdDriver driver) {
        String[] data = driver.getData();
        this.cpu.executeData(data);
    }


    /**
     * cup指挥 声卡播放声音 显卡显示画面
     *
     * @param cpu cpu
     */
    private void openCpu(Cpu cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }


    public CdDriver getCdDriver() {
        return cdDriver;
    }

    public void setCdDriver(CdDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
