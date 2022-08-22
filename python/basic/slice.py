from itertools import islice

f = open('text.txt', 'w+')

for x in islice(f, 10, 30):
    print(x)
