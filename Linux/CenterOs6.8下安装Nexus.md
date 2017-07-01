# 1. 下载安装包
wget http://download.sonatype.com/nexus/3/latest-unix.tar.gz
# 2. 解压安装包
tar -zxvf latest-unix.tar.gz
# 3. 放到/usr/local下
mv nexus-3.3.2-02/ /usr/local/nexus
# 4. 设置软链接
ln -s /usr/local/nexus nexus

# 5. 加入service
cp /usr/local/nexus/bin/nexus /etc/init.d/nexus 

# 6. 给权限
chmod 755 /etc/init.d/nexus

# 7. 设置开服启动
chkconfig --add nexus

# 8. 启动服务
service nexus start

# 9. 查看日志
tail -f /usr/local/nexus/logs/wrapper.log

问题与解决
[root@localhost bin]# service nexus start
****************************************
WARNING - NOT RECOMMENDED TO RUN AS ROOT
****************************************
If you insist running as root, then set the environment variable RUN_AS_USER=root before running this script.
修改vi ./bin/nexus 的 RUN_AS_USER=root

原文地址 : [Linux下安装配置Nexus](https://my.oschina.net/jixl/blog/293256?p=1)