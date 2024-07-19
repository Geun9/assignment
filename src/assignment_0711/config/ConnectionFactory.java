package assignment_0711.config;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Properties properties = new Properties();
    private static Connection connection = null;
    private static String url;
    private static String id;
    private static String pwd;

    private static final ConnectionFactory instance = new ConnectionFactory();

    private ConnectionFactory() {
        try {
            properties.load(new FileInputStream("src/assignment_0711/config/db.properties"));

            url = properties.getProperty("db.url");
            id = properties.getProperty("db.username");
            pwd = properties.getProperty("db.password");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
