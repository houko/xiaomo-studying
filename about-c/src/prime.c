int prime(int p) {
    int i;
    if (p <= 1) {
        return 0;
    } else if (p == 2) {
        return 1;
    } else {
        for (i = 2; i <= p / 2; i++) {
            if (p % i == 0) {
                return 0;
            } else if (i > p / 2) {
                return 1;
            }
        }
    }
    return 1;
}

int PrimeSum(int m, int n) {
    int i, sum = 0;
    for (i = m; i <= n; i++) {
        if (prime(i) != 0)
            sum += i;
    }
    return sum;

}