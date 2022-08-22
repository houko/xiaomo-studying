from random import randint

# 生成数据
data = [randint(-10, 10) for _ in range(10)]
print(data)

# 过滤数据
# filter_data = list(filter(lambda x: x >= 0, data))
filter_data = [x for x in data if x >= 0]

# print(filter_data)
