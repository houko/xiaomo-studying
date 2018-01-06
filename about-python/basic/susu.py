# 素数 生成器对象 yield
class PrimeNumber:
    def __init__(self, start, end):
        self.start = start
        self.end = end

    @staticmethod
    def is_prime_num(k):
        if k < 2:
            return False
        for i in range(2, k):
            if k % i == 0:
                return False
        retu

    def __iter__(self):
        for k in range(self.start, self.end + 1):
            if self.is_prime_num(k):
                yield k


for x in PrimeNumber(1, 100):
    print(x)
