#!/usr/bin/env bash
# 1. check the version param
if [ $# == 0 ]
    then
	echo "请输入版本号 格式为: sh tagVersion version"
	exit;
fi

# 2. 新建目录
cd /Users/xiaomo/IdeaProjects/version
if [ ! -d $1 ]; then
      mkdir $1 && cd $1
      echo "版本号根目录不存在,现在开始创建版本号根目录-------> $1 ,(服务端和客户端谁先截版谁先建根目录版本号,版本号为1.0.x.y,x为最终提交的svn版本号,y为截版更新次数)"
else
      echo "版本号己存在,现在进入到版本号根目录"
      cd $1
fi


# 3. 创建server目录 ...../version/$1/server
if [ ! -d server ]; then
	mkdir server
    echo "开始创建server目录"
else
	echo "server 目录己存在"
fi
cd server
# 4.创建core目录 ...../version/$1/server/core/$1
if [ ! -d core ]; then
	mkdir core
	cd core
	mkdir $1
	echo "开始创建core目录"
	echo "开始创建jar目录 $1"
else
   echo "core目录己存在,跳过执行"
fi

# 5.开始编译jar包
cd /Users/xiaomo/IdeaProjects/MIR/server/release
ant

# 6.拷贝jar包
cd bin
echo " 开始拷贝jar包到指定目录"
cp -R *.jar /Users/xiaomo/IdeaProjects/version/$1/server/core/$1

cd /Users/xiaomo/IdeaProjects/version/$1/server

# 7.创建data目录 ...../version/server/data
if [ ! -d data ]; then
mkdir data
echo "开始创建data目录"
cd /Users/xiaomo/IdeaProjects/MIR/config
cd data
echo "开始拉取最新data配置"
svn up
cd ..
# 8. 拷贝data配置
echo "开始拷贝data配置到version目录"
cp -R data/* /Users/xiaomo/IdeaProjects/version/$1/server/data
else
   echo "data 目录己存在"
fi

echo "所有任务执行完毕"