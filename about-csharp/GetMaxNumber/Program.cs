using System;
using System.Linq;

namespace GetMaxNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {1, 5, 6, 3, 9, 123};
            int max = GetMax(arr);
            Console.WriteLine(max);
            int min = GetMin(arr);
            Console.WriteLine(min);
        }


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