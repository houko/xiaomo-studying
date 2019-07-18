using System;

namespace ShowCalender
{
    /*1. 在控制台中显示年历的方法
     -- 调用12次显示月历方法
     2. 在控制台中显示月历的方法
    *-- 显示表头Console.WriteLine("日\t一\t……");
    *-- 计算当月1日星期数（显示空白\t）
    *-- 计算当月总天数（显示每天） Console.Write("1\t") Console.Write("2\t")
    *-- 计算当天星期数(逢六换行) Console.WriteLine();
    * 3.(赠送)根据年月日计算星期数的方法
    * 4.根据年月计算天数
    *5.根据年份判断是否为闰年
    **/
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("please input year");
            var ret = Console.ReadLine();
            var year = int.Parse(ret);
            Call(year);
        }


        /// <summary>
        /// Call the specified year.
        /// </summary>
        /// <param name="year">Year.</param>
        public static void Call(int year)
        {
            if (year <= 0)
            {
                Console.WriteLine("please input year (0-9999)");
                return;
            }

            for (int i = 1; i <= 12; i++)
            {
                PrintMonthCalendar(year, i);
                Console.WriteLine();
            }
        }


        /// <summary>
        /// Ises the leap year.
        /// </summary>
        /// <returns><c>true</c>, if leap year was ised, <c>false</c> otherwise.</returns>
        /// <param name="year">Year.</param>
        private static bool IsLeapYear(int year)
        {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }


        /// <summary>
        /// Gets the days by month.
        /// </summary>
        /// <returns>The days by month.</returns>
        /// <param name="year">Year.</param>
        /// <param name="month">Month.</param>
        private static int GetDaysByMonth(int year, int month)
        {
            if (month < 1 || month > 12) return 0;

            switch (month)
            {
                case 2:
                    //if (IsLeapYear(year))
                    //    return 29;
                    //else
                    //    return 28; 
                    return IsLeapYear(year) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }

        /// <summary>
        /// 根据天计算星期数
        /// </summary>
        /// <param name="year">年份</param>
        /// <param name="month">月份</param>
        /// <param name="day">天</param>
        /// <returns>星期数</returns>
        private static int GetWeekByDay(int year, int month, int day)
        {
            DateTime dt = new DateTime(year, month, day);
            return (int) dt.DayOfWeek;
        }

        private static void PrintMonthCalendar(int year, int month)
        {
            Console.WriteLine("{0}年{1}月", year, month);
            Console.WriteLine("日\t一\t二\t三\t四\t五\t六");
            int week = GetWeekByDay(year, month, 1); //3
            for (int i = 0; i < week; i++)
            {
                Console.Write("\t");
            }

            int days = GetDaysByMonth(year, month); //30
            for (int i = 1; i <= days; i++)
            {
                Console.Write(i + "\t");
                if (GetWeekByDay(year, month, i) == 6)
                {
                    Console.WriteLine();
                }
            }
        }


        /// <summary>
        /// Prints the year calendar.
        /// </summary>
        /// <param name="year">Year.</param>
        private static void PrintYearCalendar(int year)
        {
            for (var i = 1; i <= 12; i++)
            {
                PrintMonthCalendar(year, i);
                Console.WriteLine();
            }
        }

        /// <summary>
        /// Gets the total second by minuite.
        /// </summary>
        /// <returns>The total second by minuite.</returns>
        /// <param name="minute">Minute.</param>
        private static int GetTotalSecondByMinuite(int minute)
        {
            //分钟 --> 秒
            return minute * 60;
        }

        /// <summary>
        /// Gets the total second by minuite hour.
        /// </summary>
        /// <returns>The total second by minuite hour.</returns>
        /// <param name="minute">Minute.</param>
        /// <param name="hour">Hour.</param>
        private static int GetTotalSecondByMinuiteHour(int minute, int hour)
        {
            //小时 --> 分钟
            return GetTotalSecondByMinuite(hour * 60 + minute);
        }


        /// <summary>
        /// Gets the total second by minuite hour day.
        /// </summary>
        /// <returns>The total second by minuite hour day.</returns>
        /// <param name="minute">Minute.</param>
        /// <param name="hour">Hour.</param>
        /// <param name="day">Day.</param>
        private static int GetTotalSecondByMinuiteHourDay(int minute, int hour, int day)
        {
            //天 --> 小时
            return GetTotalSecondByMinuiteHour(minute, hour + day * 24);
        }

        /// <summary>
        /// Gets the total second.
        /// </summary>
        /// <returns>The total second.</returns>
        /// <param name="minute">Minute.</param>
        private static int GetTotalSecond(int minute)
        {
            //分钟 --> 秒
            return minute * 60;
        }

        /// <summary>
        /// Gets the total second.
        /// </summary>
        /// <returns>The total second.</returns>
        /// <param name="minute">Minute.</param>
        /// <param name="hour">Hour.</param>
        private static int GetTotalSecond(int minute, int hour)
        {
            //小时 --> 分钟
            return GetTotalSecond(hour * 60 + minute);
        }


        /// <summary>
        /// Gets the total second.
        /// </summary>
        /// <returns>The total second.</returns>
        /// <param name="minute">Minute.</param>
        /// <param name="hour">Hour.</param>
        /// <param name="day">Day.</param>
        private static int GetTotalSecond(int minute, int hour, int day)
        {
            //天 --> 小时
            return GetTotalSecond(minute, hour + day * 24);
        }
    }
}