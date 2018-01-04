from random import randint

# 生成数据
data = {x: randint(60, 100) for x in range(1, 21)}
print(data)

# 过滤数据 >90
filter_data = {k: v for k, v in data.items() if v > 90}
print(filter_data)
