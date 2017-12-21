package gold;

import gold.bean.Caller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
 * Date  : 2017/12/21 19:37
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question118 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> f1 = service.submit(new Caller("Call"));
        Future<String> f2 = service.submit(new Caller("Run"));
        String str1 = f1.get();
        String str2 = f2.get();
        System.out.println(str1+ " " + str2);


    }
}
