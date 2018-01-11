import json

import requests

# load 读取json  dump把python对象转成Json

ret = requests.get(url='http://httpbin.org/headers')
res = json.loads(ret.content)
print(res)

print('\n')
j = {'a': "abc", 'b': 'ddd'}

print(json.dumps(j))
