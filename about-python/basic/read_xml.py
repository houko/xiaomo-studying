from xml.etree.ElementTree import parse

f = open('bag.xml', encoding='utf-8')

et = parse(f)

# tag attrib text
root = et.getroot()

# root本身是一个可迭代对象
for child in root:
    for sub in child:
        print(sub.get("name"))

# 查找子节点
print(root.findall('bean'))
# 查找所有
print(list(root.iter()))
