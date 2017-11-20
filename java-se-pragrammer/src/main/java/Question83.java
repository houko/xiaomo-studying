/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/20 17:45
 * desc    : 低级到高级自动转换,高级到低级强制转换,包装类自动拆包
 * Copyright(©) 2017 by xiaomo.
 */
public class Question83 {
    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
//        iVar = fVar;
        fVar = iVar;
        dVar = fVar;
//        fVar = dVar;
        dVar = iVar;
//        iVar = dVar;
    }
}
