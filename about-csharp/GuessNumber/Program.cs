using System;

namespace GuessNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            Call();
        }

        public static void Call()
        {
            var guessCount = 0;
            var random = new Random();
            var ret = random.Next(0, 100);
            var read = 0;
            Console.WriteLine("please input a number,(0-100)");
            do
            {
                var line = Console.ReadLine();
                if (line == "")
                {
                    Console.WriteLine("please input a number,(0-100)");
                    continue;
                }

                read = int.Parse(line);
                if (read > ret)
                {
                    Console.WriteLine("猜大了");
                }
                else if (read < ret)
                {
                    Console.WriteLine("猜小了");
                }

                guessCount++;
            } while (ret != read);

            Console.WriteLine("要猜的数是{0},共猜了{1}次", ret, guessCount);
        }
    }
}