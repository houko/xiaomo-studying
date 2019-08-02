using System;
using System.Collections.Generic;

namespace BubbleSort
{
    class Program
    {
        /// <summary>
        /// 冒泡排序
        /// </summary>
        /// https://blog.csdn.net/guoweimelon/article/details/50902597
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            int[] arr = {8, 90, 85, 14, 63, 87, 2, 6, 4};

            Sort(arr);

            foreach (var i in arr)
            {
                Console.WriteLine(i);
            }
        }

        private static void Sort(IList<int> arr)
        {
            for (var i = 0; i < arr.Count - 1; i++)
            {
                for (var j = 0; j < arr.Count - 1; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        var temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
}