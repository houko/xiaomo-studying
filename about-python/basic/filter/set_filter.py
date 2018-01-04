from random import randint

data = set([randint(-10, 10) for _ in range(10)])
print(data)
filter_data = {x for x in data if x % 3 == 0}
print(filter_data)
