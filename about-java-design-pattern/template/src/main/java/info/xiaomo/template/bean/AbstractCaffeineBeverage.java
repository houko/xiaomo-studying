package info.xiaomo.template.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 20:54
 * desc  : 咖啡因饮料【基类】
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public abstract class AbstractCaffeineBeverage {


    /**
     * 模板方法【定为了final】
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourCup();
        addCondiments();
    }

    /**
     * 生成
     */
    abstract void brew();

    /**
     * 添加
     */
    abstract void addCondiments();


    public void boilWater() {
        log.info("把水烧开");
    }

    public void pourCup() {
        log.info("倒进杯子");
    }

}
