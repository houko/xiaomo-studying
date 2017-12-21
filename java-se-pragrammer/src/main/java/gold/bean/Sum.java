package gold.bean;

import java.util.concurrent.RecursiveAction;

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
 * Date  : 2017/12/21 14:48
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Sum extends RecursiveAction {
    static final int THRESHOLD_SIZE = 3;

    int stIndex, IstIndex;
    int[] data;


    public Sum(int[] data, int start, int end) {
        this.stIndex = start;
        IstIndex = end;
        this.data = data;
    }


    @Override
    protected void compute() {
        int sum = 0;
        if (IstIndex - stIndex <= THRESHOLD_SIZE) {
            for (int i = stIndex; i < IstIndex; i++) {
                sum += data[i];
            }
            System.out.println(sum);
        } else {
            new Sum(data, stIndex + THRESHOLD_SIZE, IstIndex).fork();
            new Sum(data, stIndex, Math.min(IstIndex, stIndex + THRESHOLD_SIZE)).compute();
        }
    }
}
