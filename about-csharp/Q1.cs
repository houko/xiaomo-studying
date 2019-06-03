using System;

namespace about_csharp
{
    public static class Q1
    {
        /// <summary>
        /// Q1.
        /// 一个球从100米高度落下，每次弹回原高度一半,计算：经过？次最终落地(最小弹起高度为0.01米)
        /// 总共经过？米
        /// </summary>
        public static void Call()
        {
            var height = 100f;
            var count = 0;
            var distance = height;

            while (height > 0.01f)
            {
                height /= 2;
                count++;
                distance += height;
                Console.WriteLine("ball up {0} times, height is {1}", count, height);
            }

            Console.WriteLine("total count is {0},total distance is {1}", count, distance);
        }
    }
}