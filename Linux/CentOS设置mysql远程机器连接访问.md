> linux下为了保证安全性，默认不需要mysql除本机外机器进行远程连接，需要设置mysql root账号远程连接权限:

```
mysql> grant all privileges on *.* to root@'%' identified by '数据库密码';

mysql> flush privileges;
```

> 查看开启情况：

```
mysql> use mysql;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> select host,user from user;
+--------------------+------+
| host               | user |
+--------------------+------+
| %                  | root |
| 127.0.0.1          | root |
| localhost          |      |
| localhost          | root |
| vm\_1\_181\_centos |      |
| vm\_1\_181\_centos | root |
+--------------------+------+
6 rows in set (0.00 sec)

```

> 设置mysql root账号远程访问权限后，需要打开linux防火墙3306端口，才可以远程访问mysql

具体请访问：
[centos防火墙配置](https://github.com/monsterLin/Linux_Learning_Notes/blob/master/CentOS%E9%85%8D%E7%BD%AE%E9%98%B2%E7%81%AB%E5%A2%99.md)

> 附录

https://my.oschina.net/u/1263127/blog/835446
