package info.xiaomo.oom;

import java.util.ArrayList;
import java.util.List;

public class OOMMain {
    public static final int size = Integer.MAX_VALUE;

    /***
     * 怎么快速的产生OOM
     * OOM是 out of memory，搞清楚了是什么。那就可以对症下药了
     * 粗暴一点，搞个死循环，无限分配Int最大值的新地址空间，不怕撑不爆。
     * @param args
     */
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        while (true) {
            int arr[] = new int[size / 10];
            list.add(arr);
        }
    }
}
