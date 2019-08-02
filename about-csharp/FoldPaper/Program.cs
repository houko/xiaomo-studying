using System;

namespace FoldPaper
{
    class Program
    {
        //练习：一张纸的厚度为0.0001米
        //请计算对折30次之后的厚度为多少米。
        static void Main(string[] args)
        {
            Call();
        }
        
        
        public static void Call()
        {
            var paper = 0.0001f;
            for (var i = 0; i < 30; i++)
            {
                paper *= 2;
            }

            Console.WriteLine("total is {0}", paper);
        }
    }
}