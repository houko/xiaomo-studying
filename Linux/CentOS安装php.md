CentOS安装php
---

## 配置yum源

> 追加CentOS 6.5的epel及remi源

```
# rpm -Uvh http://ftp.iij.ad.jp/pub/linux/fedora/epel/6/x86_64/epel-release-6-8.noarch.rpm
# rpm -Uvh http://rpms.famillecollet.com/enterprise/remi-release-6.rpm
```

> 以下是CentOS 7.0的源

```
# yum install epel-release
# rpm -ivh http://rpms.famillecollet.com/enterprise/remi-release-7.rpm
```

> 使用yum list命令查看可安装的包(Packege)

```
# yum list --enablerepo=remi --enablerepo=remi-php56 | grep php
```

## 安装PHP5.6

> yum源配置好了，下一步就安装PHP5.6

```
# yum install --enablerepo=remi --enablerepo=remi-php56 php php-opcache php-devel php-mbstring php-mcrypt php-mysqlnd php-phpunit-PHPUnit php-pecl-xdebug php-pecl-xhprof

# yum -y install php
```

> 用PHP命令查看版本

```
# php --version
```
---
## 附录

在这里安装的版本是PHP5.6.0，细心的用户可能已经发现ZendGuardLoader变成Zend OPcahe了。
对从PHP5.5开始PHP代码缓存从APC变成了Zend OPcache了。

---
## 相关操作

```
service httpd start 启动
service httpd restart 重新启动
service httpd stop 停止服务
```


---

## 参考

[centos安装php](http://jingyan.baidu.com/article/fedf07374b392c35ac8977fc.html)
