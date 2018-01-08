# 拆分多分割符 多個split或者正則
s = 'sadfjsadl;fjsal;dkj34sjlafjsakgjplsajf124|jlaj5'

sp = s.split(';')

for i in sp:
    t = i.split('|')
    for j in t:
        print(j)
