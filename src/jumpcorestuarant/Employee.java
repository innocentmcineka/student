/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;

import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Innocent Mcineka1
 */


public class Employee {
      // Function convert a List into Stream 
    private static <T> void getStream(List<T> list) 
    { 
        // Using optional with pre
        Optional<String> str = Optional.of("java2s.com");
        System.out.println(str);
        
        
        // Integer Primitive Streamer
  Stream<Integer> iStream = IntStream.of(3, 4, 5, 6).boxed();
        // Create stream object with the List 
        Stream<T> stream = list.stream(); 
  
        // Iterate list first to last element 
        Iterator<T> it = stream.iterator(); 
  
        // Iterate stream object 
        while (it.hasNext()) { 
            System.out.print(it.next() + " "); 
        } 
 
        // Print the stream 
        stream.forEach(s -> System.out.println(s));  
    } 
      
    
      @FunctionalInterface
        public interface Predicate<T> { 
        public boolean test(T t); 
     } 

       // BiFunction to add 2 numbers 
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 
 
        
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
      
      
   
   private final int tax= 15;
   private Integer id;
   private Integer age;
   private String gender;
   private String firstName;
   private String lastName;
           String Username;
   int Password;
   
    public final void EnterCreds(){
        System.out.println("Enter your Username"+Username+"\nEnter your Password"+Password);
    }
    
     public final void Display(){
         System.err.println("Your Entered Credentials are for user:"+firstName+" "+lastName+" is "+Username+"  "+Password);
     }
   // Data Encapsulation
   public int getID(){
   return id;
   }
   public int getAge(){
   return age;
   }
   public String getGender(){
   return gender;
   }
   public String getFirstName(){
   return firstName;
   }
      public String getLastName(){
   return lastName;
   }
      
   public void setID(int sID){
   this.id= sID;
   }
    public void setAge(int sAge){
   this.age=sAge;
   }
   public void setFirstName(String sFirstName){
   this.firstName=sFirstName;
   }
   public void setLastName(String sLastName){
   this.lastName=sLastName;
   }
   public void setGender(String sGender){
   this.gender=sGender;
   }
   //To change body of generated methods, choose Tools | Templates.
    @Override
    public String toString() {
        return this.id.toString()+" - "+this.age.toString(); 
    }
}

