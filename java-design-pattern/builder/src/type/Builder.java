package type;

import model.ExportBodyModel;
import model.ExportFootModel;
import model.ExportHeaderModel;

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
 * Date    : 2017/11/8 17:05
 * desc    :
 * Copyright(©) 2017 by xiaomo.
 */
public interface Builder {

    /**
     * 构建头部
     *
     * @param headerModel headerModel
     */
    void buildHeader(ExportHeaderModel headerModel);

    /**
     * 构建正文
     *
     * @param listMap listMap
     */
    void buildBody(Map<String, List<ExportBodyModel>> listMap);

    /**
     * 构建尾部
     *
     * @param footModel footModel
     */
    void buildFoot(ExportFootModel footModel);

    /**
     * 获取拼接结果
     *
     * @return StringBuffer
     */
    StringBuffer getResult();
}
