/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;

import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

interface users{
    public void userFirstName();
    
    public void userLastName();
    
    public void UserID(); 
    
}
public class Order {

    
    @Override
    public int hashCode(){
        Order Order1 = new Order();
        Order Order2 = new Order();
        if(Order1.equals(Order2)){
                Order1.viewOrder(0045,56 , "Cheese Burger");
        }
        return 0;
    }
     // Using Maps      
    Map<String, String> map; 

    public Order() {
        this.map = new HashMap<>();
    }
    
    // Method that manipulate the cashiers ID
    @Override // Overrides ToString Method
    public String toString(){
        
      String s =toString();
      String CashierID=s.substring(1,3);
    return CashierID;   
            }
    // Method that throws an exception that will be caught
    public static void throwException() throws NullPointerException{
    JOptionPane.showMessageDialog(null,"No Input or Incorrect Input Value");
    
    }

    public static void Order1(int sExit){
        
      String Exit= JOptionPane.showInputDialog("To Confirm Order Enter 1 and 0 to Exit");
      sExit=Integer.parseInt(Exit);
      
      
      if(sExit!=0 || sExit != 1){
      throwException();
      
      }
    }
// Method Overides from CalBill class method
    public static void viewOrder(int VOrder,int Bill,String Food){
        JOptionPane.showMessageDialog(null,"Order Number :"+VOrder+"\n\nFood Item Bought :"+Food+"\n\nTotal Bill :"+Bill);
    
    }
    // Lambda Method that consists of a return type lambda expression
    public void PredicateMethod(){
        Scanner sc= new Scanner(System.in);
		//Predicate String 
		 Predicate<String> predicateString = s -> {
                  String Name="";
	         return s.equals(Name= "Enter Employee Names :" +sc.next());
		};
                 
		System.out.println(predicateString.test("Thank you!!!"));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return true;
    }
    
}


/**
 *
 * @author Innocent Mcineka1
 */
