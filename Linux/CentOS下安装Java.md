- JDK下载 [oracle](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

- 解压
- 配置环境变量

```
vim /etc/profile


export JAVA_HOME=/home/softwares/jdk/jdk1.8.0_91  
export PATH=$JAVA_HOME/bin:$PATH  
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar  
```

- 执行命令：source /etc/profile，使修改的环境变量生效。
- 输出环境变量，查看是否有（5）中的路径:echo $PATH
- 检测安装是否成功:java -version:
- OK
