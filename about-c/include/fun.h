#ifndef max_h
#define max_h

#include <stdio.h>

// 求2个数的最大值
int max( int a, int b );

// 实现函数输出n行数字金字塔。
//输入样例：
//5
//输出样例：
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
void pyramid( int n );

// 其中x是用户传入的整型参数。符号函数的定义为：若x大于0，sign(x) = 1；若x等于0，sign(x) = 0；否则，sign(x) = −1。
int sign( int x );

// 计算m~n（m<n）之间所有整数的和的简单函数
int sum(int m, int n);

// 其中函数even将根据用户传入的参数n的奇偶性返回相应值：当n为偶数时返回1，否则返回0。
// 函数OddSum负责计算并返回传入的N个整数List[]中所有奇数的和。
int even( int n );
int OddSum( int List[], int N );

// 本题要求实现一个函数，对给定平面任意两点坐标(x1,y1)和(x2,y2)，求这两点之间的距离。
double dist( double x1, double y1, double x2, double y2 );

//本题要求实现一个判断素数的简单函数、以及利用该函数计算给定区间内素数和的函数。
//素数就是只能被1和自身整除的正整数。注意：1不是素数，2是素数。
//其中函数prime当用户传入参数p为素数时返回1，否则返回0；函数PrimeSum返回区间[m, n]内所有素数的和。
//题目保证用户传入的参数m≤n。
int prime( int p );
int PrimeSum( int m, int n );

#endif /* max_h */
