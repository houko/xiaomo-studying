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
 * Date    : 2017/11/8 17:22
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct(ExportHeaderModel headerModel, Map<String, List<ExportBodyModel>> listMap, ExportFootModel footModel) {
        builder.buildHeader(headerModel);
        builder.buildBody(listMap);
        builder.buildFoot(footModel);
    }
}
