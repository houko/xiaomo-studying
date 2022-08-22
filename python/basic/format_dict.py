# ljust左 rjust 右 center 中
s = 'abc'
print(s.ljust(20, '='))
print(s.rjust(20, '='))
print(s.center(20, '='))
# <左 >左 ^中
print(format(s, '<20'))
print(format(s, '>20'))
print(format(s, '^20'))
