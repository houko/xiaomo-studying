```
 /sbin/iptables -I INPUT -p tcp --dport 3306 -j ACCEPT
 
 /etc/rc.d/init.d/iptables save
 
 /etc/init.d/iptables status 
 
 ```
 
 > 当然如果你打开其他端口也一样，只需要把这个端口号换乘你需要的端口号即可。
 
 > 原文链接：[CentOS 打开mysql 3306端口](http://blog.csdn.net/zhongyangjian/article/details/47835197)
