# 有序字典
from collections import OrderedDict
from random import randint
from time import time

d = OrderedDict()
players = list('ABCDEFGH')

start = time()

# 模擬同學的答題時間
for x in range(8):
    input()
    p = players.pop(randint(0, 7 - x))
    end = time()
    print(x + 1, p, end - start)
    d[p] = (x + 1, end - start)

print('-' * 30)

for k in d:
    print(k, d[k])
