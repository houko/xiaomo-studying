> 创建shell脚本

```
vi bkDatabaseName.sh

#!/bin/bash
mysqldump -u user -pPass databases | gzip > /home/backup/DatabaseName_$(date +%Y%m%d_%H%M%S).sql.gz

user: 用户名
Pass: 密码
databases: 数据库
```

> 添加权限

```
chmod u+x bkDatabaseName.sh
```

> 测试脚本

```
./bkDatabaseName.sh
```

---

[CentOS下使用yum命令安装计划任务程序crontab](http://blog.csdn.net/testcs_dn/article/details/48780971)

[使用rpm命令从CentOS系统盘安装计划任务程序crontab](http://blog.csdn.net/testcs_dn/article/details/48781553)

> 添加计划任务 crontab

```
crontab -e

*/1 * * * * /home/backup/bkDatabaseName.sh

意思是每一分钟执行一次shell脚本“/home/backup/bkDatabaseName.sh”

```

> 测试任务是否执行

```
# tail -f /var/log/cron
```

---

```
- 每五分钟执行  */5 * * * *
- 每小时执行     0 * * * *
- 每天执行       0 0 * * *
- 每周执行       0 0 * * 0
- 每月执行       0 0 1 * *
- 每年执行       0 0 1 1 *
```
---
相关链接：

 - [linux下如何实现mysql数据库每天自动备份定时备份](http://blog.csdn.net/testcs_dn/article/details/48829785)
 - [crontab 每分钟、每小时、每天、每周、每月、每年定时执行](http://blog.csdn.net/youngqj/article/details/6798065)
 - [[linux]解析crontab](http://www.cnblogs.com/chenshishuo/p/5152068.html)
