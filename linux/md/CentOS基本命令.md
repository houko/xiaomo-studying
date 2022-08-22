
- df -h 显示已经挂载的分区列表
- fdisk -l 命令查看数据盘 `阿里云`
- fdisk + 磁盘  对数据盘进行分区
- mkfs.ext3 + 磁盘 对数据盘进行格式化
- mount + 磁盘  对数据库进行挂载
- echo + 磁盘 /mnt ext3 defaults 0 0 >> /etc/fstab 写入分区信息
- arch 显示机器的处理器架构(1)
- uname -m 显示机器的处理器架构(2)
- uname -r 显示正在使用的内核版本
- dmidecode -q 显示硬件系统部件 - (SMBIOS / DMI)
- date 显示系统日期
- cal 2007 显示2007年的日历表
- shutdown -h now 关闭系统(1)
- init 0 关闭系统(2)
- telinit 0 关闭系统(3)
- shutdown -r now 重启(1)
- reboot 重启(2)
- logout 注销

<!-- more --> 

- cd /home 进入 '/ home' 目录'
- cd .. 返回上一级目录
- pwd 显示工作路径
- ls 查看目录中的文件
- ls -F 查看目录中的文件
- ls -l 显示文件和目录的详细资料
- ls -a 显示隐藏文件
- mkdir dir1 创建一个叫做 'dir1' 的目录'
- mkdir dir1 dir2 同时创建两个目录
- rm -f file1 删除一个叫做 'file1' 的文件'
- rmdir dir1 删除一个叫做 'dir1' 的目录'
- rm -rf dir1 删除一个叫做 'dir1' 的目录并同时删除其内容
- rm -rf dir1 dir2 同时删除两个目录及它们的内容

---
