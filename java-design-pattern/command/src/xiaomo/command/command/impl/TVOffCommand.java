package xiaomo.command.command.impl;

import xiaomo.command.bean.TV;
import xiaomo.command.command.Command;

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
 * Date  : 2017/7/17 19:39
 * desc  : 开电视命令
 * Copyright(©) 2017 by xiaomo.
 */
public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        System.out.println("执行关电视的撤销操作");
        tv.on();
    }
}
