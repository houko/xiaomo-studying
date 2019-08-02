# 写
f = open('history', 'wt')
f.write('hello, I love programming')
f.close()

# 读
f = open('history', 'rt')
s = f.read()
print(s)
