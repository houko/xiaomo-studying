> 更新gcc，因为gcc版本太老会导致新版本python包编译不成功

```
# yum -y install gcc
```

> 下载Python-3.3.0软件包

```
# wget http://python.org/ftp/python/3.3.0/Python-3.3.0.tar.bz2
```

> 解压已下载的二进制包并编译安装

```
#tar -jxvf Python-3.3.0.tar.bz2 
#cd Python-3.3.0 
#./configure 
#make all 
#make install 
#make clean 
#make distclean 
# /usr/local/bin/python3 –V
编译安装完毕以后，可以输入上面一行命令，查看版本

```

> 建立软连接指向到当前系统默认python命令的bin目录，让系统使用新版本python

```
#mv /usr/bin/python /usr/bin/python2.4 //当前python的版本为2.4所以是python2.4 
#ln -s /usr/local/bin/python3.3 /usr/bin/python 
输入#python -V，即可查看当前默认python版本 
默认的python成功指向3.3.0以后，yum不能正常使用，需要修改yum的配置文件

```
> 修改yum配置文件 

```
#vi /usr/bin/yum 
把文件头部的#!/usr/bin/python改成#!/usr/bin/python2.4 //改为之前的老版本号 
保存退出，yum即可正常使用。如若有其他命令、软件不能正常使用，仿照yum配置文件的修改方法，修改其配置文件即可。 
至此，更新完毕
```

> 配置iBus

```
分别用 vi 打开下面两个文件，找到 exec python 那一行，把exec python 改为 exec python2.6 保存，退出。iBus在重启后就恢复正常了。

#vi /usr/bin/ibus-setup 

#vi /usr/libexec/ibus-ui-gtk 
```

---

> [Linux更换python版本](http://www.cnblogs.com/zrz43/p/4895635.html)
