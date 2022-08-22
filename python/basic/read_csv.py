import csv

# 读取csv文件筛选矫条件然后存入到另一个csv文件
# with 可以在使用完流之后自动关闭

with open('cfg_level.csv', 'r') as rf:
    reader = csv.reader(rf)
    # 读取为一个字典结果
    # reader = csv.DictReader(rf)
    with open('level.csv', 'w') as wf:
        writer = csv.writer(wf)
        headers = next(reader)
        writer.writerow(headers)
        for row in reader:
            row_level_ = row[0]
            if int(row_level_) > 50:
                break
            writer.writerow(row)
print('end')
