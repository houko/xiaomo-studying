package info.xiaomo.oop.bean.impl

import info.xiaomo.oop.bean.ILight

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 *
 * author: xiaomo
 * github: https://github.com/syoubaku
 * email: xiaomo@xiamoo.info
 * QQ_NO: 83387856
 * Date: 17/6/1 11:26
 * Description:
 * Copyright(©) 2017 by xiaomo.
 */
class Light : ILight {
    override fun on() {
        println("灯打开了")
    }

    override fun off() {
        println("灯关了")
    }

    override fun brighten() {
        println("灯变亮了")
    }

    override fun dim() {
        println("灯变暗了")
    }
}
