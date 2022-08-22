import re

# strip() lstrip() rstrip()
import string

s = '     sssssss   '
print(s.strip())

t = '-abc+'
print(t.strip('-+'))

# 切片加拼接
s = 'abc:+='
print(s[:3] + s[4:])

# replace 只能替换一种  多种可以用正则
n = '\sssdsbadf\sssdf\bbbbasdf'
print(n.replace('\\', ''))

g = '\tsdgg\rabadfdf\t'
print(re.sub('\t\r', '', g))

