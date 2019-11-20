package gold;

import java.sql.*;

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
 * Date  : 2017/12/11 20:21
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question13 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://106.15.188.160:3306/xiaomo?characterEncoding=UTF8", "xiaomo", "xiaomo");
            String query = "select * from test";
            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery(query);
            while (set.next()){
                System.out.println("id: " + set.getInt("eid"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
