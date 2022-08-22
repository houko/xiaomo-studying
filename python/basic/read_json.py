import json

import requests

# loads 读取json  dumps把python对象转成Json
# load dump(l,f)

ret = requests.get('http://httpbin.org/headers')
res = json.loads(ret.content)
print(res)

print('\n')
j = {'c': "abc", 'a': 'ddd'}

print(json.dumps(j))
