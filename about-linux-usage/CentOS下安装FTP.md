# CentOS下安装FTP

> 基于centos 7.2

## 安装

> 检测是否安装

```
rpm -qa | grep vsftpd
```

> 安装vsftpd

```
yum -y install vsftpd
```

> 运行

```
service vsftpd start
```

> 设置开机启动

```
chkconfig vsftpd on
```

> 检测是否启动

```
service vsftpd status
```

> 匿名访问

```
登陆： ftp://即可
默认的pub在/var/ftp/pub下
```

---

> 添加用户

```
/usr/sbin/adduser -d /opt/ftp -g ftp -s /sbin/nologin monsterlin
```

上面的命令是添加一个 名称为 monsterlin的用户。

命令解析：使用命令(adduser)添加monsterlin用户,不能登录系统(-s /sbin/nologin),自己的文件夹在(-d /opt/ftp)),属于组ftp(-g ftp).
有用户了，然后为该用户设置密码

```
passwd monsterlin
```

> 重启vstpd

```
[centos >= 7.0] systemctl restart vsftpd.service

[centos < 7.0]service vsftpd restart
```


---

## 参考链接：

> http://www.cnblogs.com/wolf-sun/p/6058501.html

> http://jingyan.baidu.com/article/870c6fc3754ec1b03fe4bec4.html

> http://www.cnblogs.com/feiyuanxing/p/5309627.html
