package info.xiaomo.sort;

import java.util.List;

public class SortUtil {

    /**
     * 快速排序
     *
     * @param list
     * @return
     */
    public static List<Integer> quickSort(List<Integer> list) {
        return list;
    }

    /**
     * 冒泡排序
     *
     * @param list
     * @return
     */
    public static List<Integer> bubbleSort(List<Integer> list) {
        return list;
    }

    /**
     * 插入排序
     *
     * @param list arr
     */
    public static void insertSort(int[] list) {
        // 13,6,3,31,9,27,5,11
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && key < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }


    /**
     * 希尔排序
     *
     * @param list
     * @return
     */
    public static List<Integer> RareSort(List<Integer> list) {
        return list;
    }

    /**
     * 直接选择排序
     *
     * @param list
     * @return
     */
    public static List<Integer> directSelectSort(List<Integer> list) {
        return list;
    }


    /**
     * 交换排序
     *
     * @param list
     * @return
     */
    public static List<Integer> changeSort(List<Integer> list) {
        return list;
    }

    /**
     * 归并排序
     *
     * @param list
     * @return
     */
    public static List<Integer> MergeSort(List<Integer> list) {
        return list;
    }

    /**
     * 堆排序
     *
     * @param list
     * @return
     */
    public static List<Integer> stackSort(List<Integer> list) {
        return list;
    }
}
