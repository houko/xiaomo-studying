package gold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
 * Date  : 2017/12/9 14:59
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question07 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://106.15.188.160:3306/xiaomo?characterEncoding=UTF8", "xiaomo", "xiaomo");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            statement.execute("SELECT * FROM test ");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                if (resultSet.getInt(1) == 112) {
                    resultSet.updateString(2, "Jack");
                }
            }
            resultSet.absolute(2);
            System.out.println(resultSet.getInt(1) + "" + resultSet.getString(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
