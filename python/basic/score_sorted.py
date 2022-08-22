from random import randint

score = {x: randint(60, 100) for x in 'xyzabc'}
list_score = iter(score)

t = sorted(zip(score.values(), score.keys()))

print(t)

# 或者
p = sorted(score.items())
print(p)
