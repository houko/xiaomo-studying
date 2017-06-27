CentOS安装node.js
---

> 安装gcc

```
yum -y install gcc make gcc-c++ openssl-devel wget
```

> 获取node.js资源

### 4.x

```
curl --silent --location https://rpm.nodesource.com/setup_4.x | bash -
```

### 5.x

```
curl --silent --location https://rpm.nodesource.com/setup_5.x | bash -
```

> 安装

```
yum install -y nodejs
```

> 版本

```
node -v 
```
