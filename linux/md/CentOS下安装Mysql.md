CentOS安装Mysql
---

> 使用yum进行安装
---

> 配置yum源

```
yum -y install mysql-server
```


> CentOS 7的yum源中貌似没有正常安装MySQL时的mysql-sever文件，需要去官网上下载

```
# wget http://dev.mysql.com/get/mysql-community-release-el7-5.noarch.rpm
# rpm -ivh mysql-community-release-el7-5.noarch.rpm
# yum install mysql-community-server
```

---
> 启动MySql服务

```
service mysqld start

`centos 7`  -> systemctl start  mysqld.service

```

> 命令登录MySql

```
mysql -u root
```

> 更新密码

```
mysql> set password for root@localhost=password('root');
mysql> exit;
```

> 新密码登录

```
mysql -u root -p
```

---

## 常用操作

```
show databases; //查看系统已存在的数据库
use databasesname;   //选择需要使用的数据库
drop database databasename; //删除选定的数据库
exit    //退出数据库的连接
create database test01;    //建立名为test的数据库
show tables;        // 列出当前数据库下的表
其他基本的增删改查使用标准SQL即可
```
