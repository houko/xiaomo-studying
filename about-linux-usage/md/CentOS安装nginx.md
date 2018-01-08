CentOS安装nginx
---

> 下载nginx包

```
 wget  http://nginx.org/packages/centos/7/noarch/RPMS/nginx-release-centos-7-0.el7.ngx.noarch.rpm
```

> 建立nginx的yum仓库

```
 rpm -ivh nginx-release-centos-7-0.el7.ngx.noarch.rpm
```

> 安装nginx

```
yum install nginx
```

> 启动nginx服务

```
systemctl start nginx
```

> 配置
>
>默认的配置文件在 /etc/nginx 路径下，使用该配置已经可以正确地运行nginx；如需要自定义，修改其下的 nginx.conf 等文件即可

> 测试
>
> 在浏览器地址栏中输入部署nginx环境的机器的IP

---

> 常用命令

端口：80

> 启动

```
start nginx
```

---

> 关闭

```
nginx -s stop

nginx -s quit
```
> nginx停止命令stop与quit参数的区别在于stop是快速停止nginx，可能并不保存相关信息，quit是完整有序的停止nginx，并保存相关信息。

---

> 重载nginx

```
nginx -s reload
```
> 当你改变了nginx配置信息并需要重新载入这些配置时可以使用此命令重载nginx

---

> 重新打开日志文件命令

```
nginx -s reopen

```
