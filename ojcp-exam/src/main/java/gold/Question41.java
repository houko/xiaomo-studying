package gold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
 * Date  : 2017/12/21 17:10
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question41 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://106.15.188.160:3306/xiaomo?characterEncoding=UTF8&useSSL=true", "xiaomo", "xiaomo");
        String query = "select * from test";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("sss");
            }
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
