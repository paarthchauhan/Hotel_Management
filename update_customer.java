/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update_customer {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hotelmanagement2?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Customer Phone Number:");
        String phoneNumber = scanner.nextLine();
        
        System.out.println("Enter new Name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter new Gender:");
        String gender = scanner.nextLine();
        
        System.out.println("Enter new Country:");
        String country = scanner.nextLine();
        
        System.out.println("Enter new Room Number:");
        int room = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter new Check-In Time (YYYY-MM-DD HH:MM:SS):");
        String checkInTime = scanner.nextLine();
        
        System.out.println("Enter new Deposit:");
        int deposit = Integer.parseInt(scanner.nextLine());

        updateCustomerDetails(phoneNumber, name, gender, country, room, checkInTime, deposit);
        scanner.close();
    }

    private static void updateCustomerDetails(String phoneNumber, String name, String gender, String country, int room, String checkInTime, int deposit) {
        String sql = "UPDATE customer SET name = ?, gender = ?, country = ?, room = ?, checkintime = ?, deposit = ? WHERE ph_number = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, gender);
            pstmt.setString(3, country);
            pstmt.setInt(4, room);
            pstmt.setString(5, checkInTime);
            pstmt.setInt(6, deposit);
            pstmt.setString(7, phoneNumber);
            
            int affectedRows = pstmt.executeUpdate();
            System.out.println("Updated " + affectedRows + " rows.");
        } catch (SQLException e) {
            System.out.println("Error updating customer: " + e.getMessage());
        }
    }
}
