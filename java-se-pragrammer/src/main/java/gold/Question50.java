package gold;

import gold.bean.Continent;
import gold.bean.Country;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/12/20 16:36
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question50 {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("Japan", Continent.ASIA),
                new Country("Italy", Continent.EUROPE),
                new Country("Germany", Continent.EUROPE)
        );

        Map<Continent, List<String>> collect = countries.stream()
                .collect(Collectors.groupingBy(Country::getRegion, LinkedHashMap::new, Collectors.mapping(Country::getName, Collectors.toList())));
        System.out.println(collect);

    }
}
