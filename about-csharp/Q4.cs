using System;
namespace about_csharp
{
    //练习：一张纸的厚度为0.0001米
    //请计算对折30次之后的厚度为多少米。
    public class Q4
    {
        private static void Main(String[] args)
        {
            float total = 0f;
            float paper = 0.0001f;
            for (int i = 0; i < 30; i++)
            {
                total += paper * 2;
            }
            Console.WriteLine("total is {0}", total);
        }
    }
}
