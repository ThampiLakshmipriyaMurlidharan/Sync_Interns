/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinesurvey;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aspire 5 Slim
 */
public class Connection {
    static Connection connection;
    public static Connection createConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/surveysystem","root","");

        return connection;
    }
    
}
