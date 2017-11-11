import lombok.extern.slf4j.Slf4j;
import model.ExportBodyModel;
import model.ExportFootModel;
import model.ExportHeaderModel;
import type.Builder;
import type.impl.XmlBuilderImpl;

import java.util.ArrayList;
import java.util.HashMap;
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
 * Date    : 2017/11/8 17:38
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class BuildMain {
    public static void main(String[] args) {
        Builder builder = new XmlBuilderImpl();
        Director director = new Director(builder);
        ExportHeaderModel headerModel = new ExportHeaderModel();
        headerModel.setDepId(1);
        ExportBodyModel product1 = new ExportBodyModel();
        product1.setProductId(1);
        product1.setPrice(10);
        product1.setAmount(10);

        ExportBodyModel product2 = new ExportBodyModel();
        product2.setProductId(2);
        product2.setPrice(20);
        product2.setAmount(20);
        Map<String, List<ExportBodyModel>> listMap = new HashMap<>(10);
        List<ExportBodyModel> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        listMap.put("产品", list);

        ExportFootModel footModel = new ExportFootModel();
        footModel.setExportUser("小莫");

        director.construct(headerModel, listMap, footModel);
        log.info("{}", builder.getResult());
    }
}
