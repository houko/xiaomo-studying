using System;
namespace about_csharp
{
    public class AppMain
    {
        public static void Main(String[] args)
        {
            Q6 q6 = new Q6
            {
                Age = 5,
                Name = "xiaomo"
            };

            Console.WriteLine("my name is {0},age is {1}", q6.Name, q6.Age);
        }
    }
}
