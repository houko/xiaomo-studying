from collections import namedtuple

student = ('Jum', 16, 'Male', '83387856@qq.com')

# NAME = 0
# AGE = 1
# SEX = 2
# MAIL = 3

# 列表拆包
NAME, AGE, SEX, MAIL = range(4)

print(student[NAME])
print(student[AGE])
print(student[SEX])
print(student[MAIL])

Student = namedtuple('student', ['name', 'age', 'sex', 'mail'])

s = Student("xiaomo", 15, "Male", "xiaomo@xiaomo.info")

print(s.name)
print(s.age)
print(s.sex)
print(s.mail)
