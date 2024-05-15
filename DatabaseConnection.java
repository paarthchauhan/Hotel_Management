/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aryanbhoi
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/hotelmanagementsystem";
    private static final String USERNAME = "root"; // Change to your MySQL username
    private static final String PASSWORD = "Codeno12@"; // Change to your MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}