package info.xiaomo.command;

import info.xiaomo.command.command.Command;

import java.util.HashMap;
import java.util.Map;

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
 * Date  : 2017/7/17 19:41
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class RemoteControl {
    private Map<RemoteType,Command> commandMap = new HashMap<>();

    private Command lastCommand;

    public void registerCommand(RemoteType remoteType,Command command) {
        commandMap.put(remoteType,command);
    }

    public void buttonWasPressed(RemoteType type) {
        Command command = commandMap.get(type);
        command.execute();
        lastCommand = command;
    }

    public Command getLastCommand() {
        return lastCommand;
    }

    enum RemoteType {
        LIGHT_ON(1),
        LIGHT_OFF(2),
        TV_ON(3),
        TV_OFF(4);

        private int type;

        RemoteType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }
}
