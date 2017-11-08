package type.impl;

import model.ExportBodyModel;
import model.ExportFootModel;
import model.ExportHeaderModel;
import type.Builder;

import java.util.List;
import java.util.Map;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/8 17:10
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class TextBuilderImpl implements Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel headerModel) {
        sb.append(headerModel.getDepId());
    }

    @Override
    public void buildBody(Map<String, List<ExportBodyModel>> listMap) {
        for (String tableName : listMap.keySet()) {
            List<ExportBodyModel> models = listMap.get(tableName);
            sb.append(tableName);
            sb.append("\n");
            for (ExportBodyModel model : models) {
                sb.append(model.getProductId());
                sb.append("\n");
                sb.append(model.getPrice());
                sb.append("\n");
                sb.append(model.getAmount());
                sb.append("\n");
            }
        }
    }

    @Override
    public void buildFoot(ExportFootModel footModel) {
        sb.append(footModel.getExportUser());
    }

    @Override
    public StringBuffer getResult() {
        return sb;
    }


}
