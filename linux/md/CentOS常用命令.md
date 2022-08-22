> CenterOs常用命令

---
## 文件夹

- 新建文件夹 

  > mkdir xx

- 删除文件夹 
  
  > rm -rf  xx

## 解压缩

- 安装zip插
 
  > yum install -y unzip zip

- 解压
  
  > unzip xxx.zip

## git

- 安装git
  
  > sudo yum install git-core

## 移动

- 移动文件到某一文件

```
mv phpMyAdmin-4.6.0-all-languages /usr/local/nginx/html
```

## 重命名

```
mv phpMyAdmin-4.6.0-all-languages phpMyAdmin
```

## 解压tar.gz文件

```
tar -zxv -f xx.tar.gz
```

## 查看与php有关的rpm包

```
rpm -qa | grep php
```

## 移除包

```
yum remove xxx
```

## yum强行解除锁定

```
rm -rf /var/run/yum.pid

```
## 查看安装的软件

```
rpm -qa
```

## 过滤安装的软件

```
rpm -qa | grep "xxx"
```
> 相关链接：[CentOS下判断软件是否已安装](http://www.centoscn.com/CentOS/Intermediate/2015/0423/5248.html)

## 设置软件开机自启

```
sudo chkconfig xxx on
```
