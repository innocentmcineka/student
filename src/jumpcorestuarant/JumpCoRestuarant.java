/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;


/**
 *
 * @author Innocent Mcineka1
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JumpCoRestuarant {

    /**
     * @param args the command line arguments
     */
    static Connection connection = null;
    static String database="";
    static String url = "jdbc:mysql://localhost:3306/JumpRestaurant";
    static String username = "root";
    static String password = "";
    
    public static void tblEmployee() throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query = "select * from Employee";
            ResultSet rs = stmt.executeQuery(query);
             while (rs.next()) {
                String EmpID = rs.getString("EmpID");
                String EmpName = rs.getString("EmpName");
                String EmpAdress = rs.getString("EmpAddress");
                String EmpPhoneNum = rs.getString("EmpPhoneNum");
                String EmpEmail = rs.getString("EmpEmail");
           
               System.out.println("ID  "+EmpID+"     Employee Name   "+EmpName+ "    EmpAdress   "+EmpAdress+"   EmpPhoneNum   "+EmpPhoneNum+"    EmpEmail   "+EmpEmail);
            }
    }

    
    public static void tblCustomer() throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query = "select * from Customer";
            ResultSet rs = stmt.executeQuery(query);
             while (rs.next()) {
            
                String CusID = rs.getString("CusID");
                String CusName = rs.getString("Name");
                String CusPhoneNum = rs.getString("PhoneNumber");
                String CusEmail = rs.getString("Email");
                String CusOrderNumber = rs.getString("OrderNumber");
                String CusBill = rs.getString("Bill");
                
                
                System.out.println("CustomerID  "+CusID+"   CusName "+CusName+"    CusPhoneNumber "+CusPhoneNum+"     CusEmail "+CusEmail+"     CusOrderNumber "+CusOrderNumber+"    CusBill "+CusBill);
            }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        tblCustomer();
       tblEmployee();
            

    
    
    
    
    
    
    
    
    DateClass Date = new DateClass();
    Date.Date();
    CalBill CB = new CalBill();
    CB.CalBill();
    CB.viewOrder(CB.Order, CB.Total, CB.Food);
    Order viewOrder = new Order();

    // Creating immutable objects
     final Order myOrder ;     
     myOrder = new CalBill();  

    Employee Employ= new Employee();
    Employ.setAge(12);Employ.setID(678); Employ.setGender("M");Employ.setFirstName("John");Employ.setLastName("Mcineka");
    }

}
