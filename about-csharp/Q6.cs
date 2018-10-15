using System;
namespace about_csharp
{
    /// <summary>
    /// 排序
    /// </summary>
    public static class Q6
    {
        public static int[] SelectSort(params int[] arr)
        {
            int temp = 0;
            int size = arr.Length;
            for (int i = 0; i < size; i++)
            {
                int k = i;
                for (int j = arr.Length - 1; j > i; j--)
                {
                    if (arr[j] < arr[k])
                    {
                        k = j;
                    }
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            return arr;
        }
    }
}
