from tempfile import NamedTemporaryFile, TemporaryFile

# 创建的文件是找不到的
f = TemporaryFile()
f.write(b'asdfsdab' * 10000000)
f.seek(0)
s = f.read(100)
print(s)

# 可以找到的临时文件  设置 delete=False 可以不删除文件
g = NamedTemporaryFile()
print(g.name)
