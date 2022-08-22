#! /usr/bin/python3

"""
 把今天最好的表现当作明天最新的起点．．～
 いま 最高の表現 として 明日最新の始発．．～
 Today the best performance  as tomorrow newest starter!
 Created by IntelliJ IDEA.
 author: xiaomo
 github: https://github.com/syoubaku
 email: xiaomo@xiamoo.info
 QQ_NO: 83387856
 Date: 2018/1/30 11:04 
 Description: 
 Copyright(©) 2017 by xiaomo.
"""
import re

pattern = re.compile('.')

ret = re.search(pattern, 'd')

print(ret.group())
