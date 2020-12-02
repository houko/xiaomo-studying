int even(int n) {
    if (n % 2 == 0) {
        return 1;
    } else {
        return 0;
    }
}

int OddSum( int list[], int N) {
    int sum = 0;
    for (int i = 0; i < N; ++i) {
        int value = list[i];
        if (even(value) == 0) {
            sum += value;
        }
    }
    return sum;
}