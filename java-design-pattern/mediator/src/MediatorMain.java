import module.MainBoard;
import module.impl.CPU;
import module.impl.CdDriver;
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
 * Date    : 2017/11/9 14:59
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class MediatorMain {

    public static void main(String[] args) {
        // 创建主板
        MainBoard mainBoard = new MainBoard();
        CdDriver cdDriver = new CdDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VideoCard videoCard = new VideoCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        mainBoard.setCdDriver(cdDriver);
        mainBoard.setCpu(cpu);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setVideoCard(videoCard);

        // 插入cd 开始播放
        cdDriver.readCd();

    }
}
