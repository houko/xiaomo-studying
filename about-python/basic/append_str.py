# 加号或 str.join()
s = '-'
# 只有字符串可以直接拼接，如果有数字要转成string
# res = s.join(['i', 'love', 'you'])
res = s.join(str(x) for x in ['i', 'love', 'you', 520])

print(res)
