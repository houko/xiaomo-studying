using System;


namespace about_csharp
{
    /// <summary>
    /// Q1.
    /// 一个球从100米高度落下，每次弹回原高度一半,计算：经过？次最终落地(最小弹起高度为0.01米)
    /// 总共经过？米
    /// </summary>
    class Q1
    {
        static void Main(string[] args)
        {
            float height = 100f;
            int count = 0;
            float distance = height;

            while (height > 0.01f)
            {
                height = height / 2;
                count++;
                distance += height;
                Console.WriteLine("ball up {0} times, height is {1}", count, height);

            }

            Console.WriteLine("total count is {0},totoal distance is {1}", count, distance);
        }
    }
}
