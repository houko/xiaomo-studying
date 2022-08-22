# 存儲用戶的定長歷史記錄(猜數字遊戲，輸入一個數和隨機數進行比較)
import pickle
from collections import deque
from random import randint

n = randint(0, 100)
history = deque([], 5)


# history = pickle.load(open('history'))


def guess(k):
    if k == n:
        print("right")
    if k < n:
        print("less-than ", k)
    else:
        print("bigger-than", k)
    return False


while True:
    i = input('please input a number:')
    if i.isdigit():
        temp = int(i)
        history.append(temp)
        pickle.dump(history, open('history', 'wb+'))
        if guess(temp):
            break
    elif i == 'history' or i == 'h':
        print(list(history))
