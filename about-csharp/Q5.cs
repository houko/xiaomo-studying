using System.Linq;

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
            var max = arr[0];

            return arr.Concat(new[] {max}).Max();
        }

        /// <summary>
        /// Gets the minimum.
        /// </summary>
        /// <returns>The minimum.</returns>
        /// <param name="arr">Arr.</param>
        public static int GetMin(params int[] arr)
        {
            var min = arr[0];

            return arr.Concat(new[] {min}).Min();
        }
    }
}