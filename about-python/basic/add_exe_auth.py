# 给所有的.py文件给权限
import os
import stat

listdir = os.listdir(".")

for i in listdir:
    if i.endswith(('.py', '.sh')):
        print(i)
        os.chmod(i, stat.S_IXUSR)
