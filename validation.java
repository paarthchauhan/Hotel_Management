/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

/**
 *
 * @author aryanbhoi
 */

interface validate
{
    boolean isValidName(String name) ;
    boolean isValidGender(String gender);
    boolean isValidAge(String age);
    boolean isValidJob(String job);
    boolean isValidSalary(String salary);
    boolean isValidPhone(String phone) ;
    boolean isValidEmail(String email) ;
    boolean isValidAadhar(String aadhar);
    
    
}
public class validation implements validate {
    @Override
    public boolean isValidName(String name) {
        return true;
    }

    @Override
    public boolean isValidGender(String gender) {
        return true;
    }

    @Override
    public boolean isValidAge(String age) {
        return true;
    }

    @Override
    public boolean isValidJob(String job) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isValidSalary(String salary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isValidPhone(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isValidEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isValidAadhar(String aadhar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
