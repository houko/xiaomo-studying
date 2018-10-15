using System;
namespace about_csharp
{
    //练习：一张纸的厚度为0.0001米
    //请计算对折30次之后的厚度为多少米。
    public static class Q4
    {
        public static void Call()
        {

            float paper = 0.0001f;
            for (int i = 0; i < 30; i++)
            {
                paper *= 2;
            }
            Console.WriteLine("total is {0}", paper);
        }
    }
}
