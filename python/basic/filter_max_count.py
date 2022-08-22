from random import randint
from typing import Counter

# re 是正则表达式模块
import re

data = [randint(0, 20) for _ in range(30)]
print(data)

d = dict.fromkeys(data, 0)

for x in data:
    d[x] += 1

print(d)
counter = Counter(data)

# 频次最高的3个数
print(counter.most_common(3))

# 频次最高的10个单词
txt = open('text.txt', encoding="utf-8").read()
world_counter = Counter(re.split('\W+', txt))
print(world_counter.most_common(10))
