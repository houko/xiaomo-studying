#include "../include/fun.h"
#include "stdio.h"

void printSpace(int n){
    for (int i = 0; i < n; ++i) {
        printf(" ");
    }
}


void pyramid(int n){
    for (int i = 1; i <= n; ++i) {
        printSpace(n-i);
        for (int j = 1; j <= i; ++j) {
            printf("%d ",i);
        }
        printf("\n");
    }
}

