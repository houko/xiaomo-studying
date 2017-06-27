CentOS源码级安装nginx
---

> 准备工具

```
yum install gcc gcc-c++ ncurses-devel
yum -y install zlib zlib-devel openssl openssl--devel pcre pcre-devel 
```

> 安装

> 进入/usr/local文件夹下

```
cd /usr/local
```

> 下载nginx

```
wget http://nginx.org/download/nginx-1.7.4.tar.gz
```

> 解压

```
tar -zxv -f nginx-1.7.4.tar.gz
```

> 进入nginx目录下

```
cd nginx-1.7.4
```

> 编译安装

```
./configure --prefix=/opt/nginx
make
make install
```

---

> 通过上述安装我们发现配置为文件在/opt/nginx

> 特别注意：configure --prefix 配置，后面的目录，不能是安装包当前的解压目录，因为后面再install过程中，会从解压包中拷贝配置文件到指定的prefix中去，如果这两个目录相同，cp失效出现 the same file 的错误，导致install 终止，安装会失败。

---

> 启动

```
cd /opt/nginx
./nginx
```

> 重启

```
/usr/local/nginx/sbin/nginx -s reload
```

> 停止

```
查询nginx主进程号: ps -ef | grep nginx 

停止进程: kill -QUIT 主进程号  

快速停止: kill -TERM 主进程号  

强制停止: pkill -9 nginx 

```

