# 创建新分支
```
git brahch develop
git push -u origin develop
```

# 开始新Feature开发
```
# 从develop上切新分支
git checkout -b some-feature develop
# Optionally, push branch to origin:
# 把切出来的新分支推送上去
git push -u origin some-feature    

# 做一些改动    
git status
git add some-file
git commit    
```

# 完成Feature
```
## 从develop上拉代码到自己的分支
git pull origin develop
## 切换到develop分支
git checkout develop
## 合并代码到develop分支
git merge --no-ff some-feature
git push origin develop

## 切换到自己的分支
git branch -d some-feature

## 推送并删除无用的分支
git push origin --delete some-feature   
```

# 开始Release
```
git checkout -b release-0.1.0 develop
```

# 完成Release
```
git checkout master
git merge --no-ff release-0.1.0
git push

git checkout develop
git merge --no-ff release-0.1.0
git push

git branch -d release-0.1.0

# If you pushed branch to origin:
git push origin --delete release-0.1.0   


git tag -a v0.1.0 master
git push --tags
```

# hotFix
```
git checkout -b hotfix-0.1.1 master    

git checkout master
git merge --no-ff hotfix-0.1.1
git push


git checkout develop
git merge --no-ff hotfix-0.1.1
git push

git branch -d hotfix-0.1.1

git tag -a v0.1.1 master
git push --tags
```