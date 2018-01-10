# 写
f = open('history', 'wt', encoding='utf-8')
f.write('hello, I love programming')
f.close()

# 读
f = open('history', 'rt', encoding='utf-8')
s = f.read()
print(s)
