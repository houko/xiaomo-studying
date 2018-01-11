import xlrd
import xlwt

rbook = xlrd.open_workbook('cfg_item.xlsx')
rsheet = rbook.sheet_by_index(0)
rcell = rsheet.cell(1, 1)
rrow = rsheet.row(1)
rrow_value = rsheet.row_values(1)

print(rcell)
print(rrow)
print(rrow_value)

ncols = rsheet.ncols
rsheet.put_cell(0, ncols, xlrd.XL_CELL_TEXT, '总数', None)

t = 0
for row in range(1, rsheet.nrows):
    t += rsheet.cell(row, 0).value
    # 添加单元格
rsheet.put_cell(1, ncols, xlrd.XL_CELL_NUMBER, t, None)
wbook = xlwt.Workbook
