package info.xiaomo.command;

import info.xiaomo.command.bean.Light;
import info.xiaomo.command.bean.TV;
import info.xiaomo.command.command.impl.LightOffCommand;
import info.xiaomo.command.command.impl.LightOnCommand;
import info.xiaomo.command.command.impl.TVOffCommand;
import info.xiaomo.command.command.impl.TVOnCommand;

import static info.xiaomo.command.RemoteControl.RemoteType;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 19:32
 * desc  : 命令模式
 * Copyright(©) 2017 by xiaomo.
 */
public class CommandMain {
    public static void main(String[] args) {
//        SimpleRemoteControl control = new SimpleRemoteControl();
//        Light light = new Light();
//        control.setCommand(lightOnCommand);
//        control.buttonWasPressed();

        RemoteControl remoteControl = registerCommand(new RemoteControl());
        remoteControl.buttonWasPressed(RemoteType.LIGHT_ON);
        remoteControl.buttonWasPressed(RemoteType.TV_OFF);
        remoteControl.buttonWasPressed(RemoteType.TV_ON);
        remoteControl.buttonWasPressed(RemoteType.LIGHT_OFF);

    }

    public static RemoteControl registerCommand(RemoteControl remoteControl) {
        Light light = new Light();
        TV tv = new TV();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        remoteControl.registerCommand(RemoteType.LIGHT_ON,lightOnCommand);
        remoteControl.registerCommand(RemoteType.LIGHT_OFF,lightOffCommand);
        remoteControl.registerCommand(RemoteType.TV_ON,tvOnCommand);
        remoteControl.registerCommand(RemoteType.TV_OFF,tvOffCommand);
        return remoteControl;
    }
}
