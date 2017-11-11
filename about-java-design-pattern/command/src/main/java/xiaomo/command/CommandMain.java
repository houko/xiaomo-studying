package xiaomo.command;

import lombok.extern.slf4j.Slf4j;
import xiaomo.command.bean.Light;
import xiaomo.command.bean.Tv;
import xiaomo.command.command.Command;
import xiaomo.command.command.impl.LightOffCommand;
import xiaomo.command.command.impl.LightOnCommand;
import xiaomo.command.command.impl.TvOffCommand;
import xiaomo.command.command.impl.TvOnCommand;

import java.util.ArrayList;
import java.util.List;

import static xiaomo.command.RemoteControl.RemoteType;

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
 * Date  : 2017/7/17 19:32
 * desc  : 命令模式
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class CommandMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = registerCommand(new RemoteControl());
        remoteControl.buttonWasPressed(RemoteType.LIGHT_ON);
        remoteControl.buttonWasPressed(RemoteType.TV_OFF);
        remoteControl.buttonWasPressed(RemoteType.TV_ON);
        remoteControl.buttonWasPressed(RemoteType.LIGHT_OFF);


        Command lastCommand = remoteControl.getLastCommand();
        lastCommand.undo();

        // 执行宏命令（将多个命令绑定在一个按钮上）
        // 队列请求，线程执行，日志请求
        log.info("---------执行宏命令（将多个命令绑定在一个按钮上）----------------");
        executeMacroCommand();

    }

    public static RemoteControl registerCommand(RemoteControl remoteControl) {
        Light light = new Light();
        Tv tv = new Tv();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        remoteControl.registerCommand(RemoteType.LIGHT_ON, lightOnCommand);
        remoteControl.registerCommand(RemoteType.LIGHT_OFF, lightOffCommand);
        remoteControl.registerCommand(RemoteType.TV_ON, tvOnCommand);
        remoteControl.registerCommand(RemoteType.TV_OFF, tvOffCommand);
        return remoteControl;
    }

    public static void executeMacroCommand() {
        Light light = new Light();
        Tv tv = new Tv();
        List<Command> commands = new ArrayList<>();
        commands.add(new TvOnCommand(tv));
        commands.add(new LightOnCommand(light));
        for (Command command : commands) {
            command.execute();
        }
    }
}
