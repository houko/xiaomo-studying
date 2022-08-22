#include "../include/fun.h"



int sum(int m, int n){
    int total = 0;
    for (int i = m; i<=n; i++) {
        total += i;
    }
    return total;
}