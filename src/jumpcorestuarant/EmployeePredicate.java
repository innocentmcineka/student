/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javafx.scene.paint.Color;
/**
 *
 * @author Innocent Mcineka1
 */
// Generic Class
public class EmployeePredicate<T> {
  
     // Map  
    Map<String, String> map; 

    public EmployeePredicate() {
        this.map = new HashMap<>();
    }
    
     private T Username;
     private T Password;
    
     // Generic Methods
     public T getUsername(T UserN){
         return Username= UserN;
         }
        
     public T getPassword(T Passw){
         return this.Password= Passw;
         }
      
      
      
     // implemeted methods
      
    public void EnterCreds(){
        System.out.println("Enter your Username"+Username+"\nEnter your Password"+Password);
    }
    
     public void Display(){
         System.err.println("Your Entered Credentials are :"+ Username+"  "+Password);
     }
    
    Employee Emp= new Employee();
    // Predicate and lambda expressions
    public static Predicate<Employee>isAdultMale(){

    return x->x.getAge()>21 && x.getGender().equalsIgnoreCase("M");
     }  
    
     public static Predicate<Employee>isMoreThan(int Age){
      return a->a.getAge()>Age;
     }

    public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) 
    {
        return employees.stream()
                    .filter( predicate )
                    .collect(Collectors.<Employee>toList());
    }
}
