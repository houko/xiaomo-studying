using System;
namespace about_csharp
{
    /// <summary>
    /// 获取数组中最大/最小的数
    /// </summary>
    public class Q5
    {

        /// <summary>
        /// Gets the max.
        /// </summary>
        /// <returns>The max.</returns>
        /// <param name="arr">Arr.</param>
        public static int GetMax(params int[] arr)
        {
            int max = arr[0];
            foreach (int i in arr)
            {
                if (i > max)
                {
                    max = i;
                }
            }

            return max;
        }

        /// <summary>
        /// Gets the minimum.
        /// </summary>
        /// <returns>The minimum.</returns>
        /// <param name="arr">Arr.</param>
        public static int GetMin(params int[] arr)
        {
            int min = arr[0];
            foreach (int i in arr)
            {
                if (i < min)
                {
                    min = i;
                }
            }

            return min;
        }
    }
}
