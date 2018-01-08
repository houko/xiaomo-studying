## 概念整理

- 对于Linux来说，文件只是比特和字节流
- 在Linux上运行的程序才关心他们组成的格式

## 命令整理

> 删除

```
通配符的使用

rm libby1*.jpg  
rm libby*.jpg
rm *txt
rm * 删除目录的所有文件

rm libby1?.jpg
rm libby?.* 

rm libby1[12].jpg  libby11.jpg到libby12.jpg
rm libby1[0-2].jpg libby10.jpg到libby12.jpg
rm libby[6-8].jpg libby6.jpg到libby8.jpg

```

<!-- more --> 

> ls常用命令

```
ls : 显示所有可见的文件及文件夹
ls music : 显示music文件夹下的内容
ls ~/videos/*.wmv : 显示video下的wmv格式的文件
ls -1 : 以单独一列显示内容
ls -m : 以逗号作为分隔显示内容
ls -a : 查看隐藏的文件和文件夹

> 在ls -a 中默认包含`.` 和`..` 两个文件夹：`.`表示当前目录,'..'表示上一级目录

ls -F : 显示文件的类型
> `*`表示可执行文件；`/`表示一个目录；没有任何符号表示一个文件；

ls -l : 显示权限和所有者等详细信息
ls -r : 以相反顺序显示列表内容
ls -X : 按文件的扩展名排序
ls -t : 按时间和日期排序
ls -S : 按文件大小进行排序
ls -h : 用K M G显示文件的大小

```

> 显示当前的目录路径

```
pwd
```

> 切换命令

```
cd ~ : 切换到home目录
cd - : 切换到以前的目录
```

---

- ls-r : 以相反的顺序显示列表内容
- ls -X : 按文件的扩展名排序
- ls -t : 按时间和日期排序
- ls -S : 按文件大小进行排序
- ls -h : 用K M G 显示文件大小
