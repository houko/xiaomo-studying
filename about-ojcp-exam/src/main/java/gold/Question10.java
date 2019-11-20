package gold;

import java.sql.Connection;
import java.sql.DriverManager;
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
 * Date  : 2017/12/11 19:14
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question10 {
    static Connection newConnection;

    public static Connection getDbConnection() throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://106.15.188.160:3306/xiaomo?characterEncoding=UTF8", "xiaomo", "xiaomo")) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getDbConnection();
        Statement statement = newConnection.createStatement();
        statement.executeUpdate("INSERT INTO test VALUE (11,'22233')");

    }

}
