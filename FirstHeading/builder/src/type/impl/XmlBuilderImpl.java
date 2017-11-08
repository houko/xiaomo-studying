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
 * Date    : 2017/11/8 17:17
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class XmlBuilderImpl implements Builder {

    private StringBuffer sb = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\n");


    @Override
    public void buildHeader(ExportHeaderModel headerModel) {
        sb.append("<Report>").append(headerModel.getDepId()).append("</Report>").append("\n");
    }

    @Override
    public void buildBody(Map<String, List<ExportBodyModel>> listMap) {
        sb.append("<Body>").append("\n\t");
        for (String s : listMap.keySet()) {
            sb.append("<Product>").append("\n\t").append("<Name>").append(s).append("</Name>").append("\n\t\t");
            List<ExportBodyModel> bodyModels = listMap.get(s);
            for (ExportBodyModel bodyModel : bodyModels) {
                sb.append("<Id>").append(bodyModel.getProductId()).append("</Id>").append("\n\t\t");
                sb.append("<Price>").append(bodyModel.getPrice()).append("</Price>").append("\n\t\t");
                sb.append("<Amount>").append(bodyModel.getAmount()).append("</Amount>").append("\n\t\t");
            }
            sb.append("</Product>").append("\n");
        }
        sb.append("</Body>").append("\n");
    }

    @Override
    public void buildFoot(ExportFootModel footModel) {
        sb.append("<Footer>").append(footModel.getExportUser()).append("</Footer>");
    }

    @Override
    public StringBuffer getResult() {
        return sb;
    }
}
