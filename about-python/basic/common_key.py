from random import randint, sample

# 在abcdefg里隨機3-6個出來
data = sample('abcdefg', randint(3, 6))

# 生產3組數據
s1 = {x: randint(1, 4) for x in data}
s2 = {x: randint(1, 4) for x in data}
s3 = {x: randint(1, 4) for x in data}
print(s1)
print(s2)
print(s3)

res = []

for k in s1:
    if k in s2 and k in s3:
        res.append(k)

print(res)
