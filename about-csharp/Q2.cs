using System;

namespace about_csharp
{
    // 程序产生1--100之间的随机数
    // 在控制台中，让用户重复猜测，直到猜对为止。
    // 每次提示：大了、小了、终于猜对了，总共猜了?次。
    public static class Q2
    {
        public static void Call()
        {
            Random random = new Random();
            int ret = random.Next(0, 100);
            int read = 0;
            do
            {
                read = int.Parse(Console.ReadLine());
                if (read > ret)
                {
                    Console.WriteLine("猜大了");
                }
                else if (read < ret)
                {
                    Console.WriteLine("猜小了");
                }
            } while (ret != read);
        }
    }
}