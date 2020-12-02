#include <stdio.h>
#include "include/fun.h"

#define MAXN 10

// https://pintia.cn/problem-sets/12/problems/type/6

int main() {
    int a, b;

    scanf("%d %d", &a, &b);
    // 1  求2个数的最大值
    printf("\n");
    printf("sum = %d\n", sum(a, b));
    // 2
    printf("\n");
    printf("max = %d\n", max(a, b));

    // 3
    // 实现函数输出n行数字金字塔。
    // 输出样例：
    //     1
    //    2 2
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5
    printf("\n");
    pyramid(a);

    // 4其中x是用户传入的整型参数。
    // 符号函数的定义为：
    // 若x大于0，sign(x) = 1；
    // 若x等于0，sign(x) = 0；
    // 否则，sign(x) = −1。
    printf("\n");
    printf("sign(%d) = %d\n", a, sign(a));

    // 5 本题要求实现一个函数，计算N个整数中所有奇数的和，同时实现一个判断奇偶性的函数。
    //   其中函数even将根据用户传入的参数n的奇偶性返回相应值：当n为偶数时返回1，否则返回0。
    //   函数OddSum负责计算并返回传入的N个整数List[]中所有奇数的和。
    printf("\n");
    int arr[6] = {1, 2, 3, 3, 5, 6};
    printf("%d\n", OddSum(arr, sizeof(arr) / sizeof(int)));

    // 6  本题要求实现一个函数，对给定平面任意两点坐标(x1,y1)和(x2,y2)，求这两点之间的距离。
    printf("\n");
    double x1 = 1, y1 = 1, x2 =5, y2 = 6;
    printf("dist = %.2f\n", dist(x1, y1, x2, y2));

    printf("\n");
    // 7.
    //本题要求实现一个判断素数的简单函数、以及利用该函数计算给定区间内素数和的函数。
    //素数就是只能被1和自身整除的正整数。注意：1不是素数，2是素数。
    //其中函数prime当用户传入参数p为素数时返回1，否则返回0；函数PrimeSum返回区间[m, n]内所有素数的和。
    //题目保证用户传入的参数m≤n。
    printf("sum= %d\n", PrimeSum(1,100));

    return 0;
}
