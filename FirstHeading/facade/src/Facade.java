import genereate.GenerateHandler;
import genereate.GenerateMessage;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/8 14:32
 * desc    : facade最后做成静态
 * Copyright(©) 2017 by xiaomo.
 */
public class Facade {

    public static void generate() {
        GenerateMessage message = new GenerateMessage();
        message.generete();
        GenerateHandler handler = new GenerateHandler();
        handler.generate();
    }

}
