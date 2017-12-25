package gold;

import gold.bean.FileThread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

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
 * Date  : 2017/12/21 19:23
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question112 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Stream<Path> projects = Files.walk(Paths.get("G:\\IdeaProject\\BookNote\\java-se-pragrammer\\src\\main\\java\\gold\\bean"));
        projects.forEach(line -> service.execute(new FileThread(line.getFileName().toString())));

        service.shutdown();
        service.awaitTermination(5, TimeUnit.DAYS);
    }
}
