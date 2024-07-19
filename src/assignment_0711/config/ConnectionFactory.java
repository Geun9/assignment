package assignment_0711.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // ConnectionFactory에 MySQL server로 부터 Connection을 얻어오는 open() 메서드를 작성
    // 조건: 싱글톤 패턴을 적용하여 만들어주세요.


    private static Connection connection = null;
    private static String url = "jdbc:mysql://localhost:3306/ssgdatabase?characterEncoding=UTF-8&serverTimezone=UTC";
    private static String id = "root";
    private static String pwd = "qwer1234";

    private static final ConnectionFactory instance = new ConnectionFactory();

    private ConnectionFactory() {

    }

    public static ConnectionFactory getInstance() {
        return instance;
    }

    public Connection open() {
        try {
            connection = DriverManager.getConnection(url, id, pwd);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
