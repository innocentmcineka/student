/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Innocent Mcineka1
 */
public class CalBill extends Order {
                       
      public int Order;
      public int Total=0;
      public String Food;
      
      // Unchecked exceptions occur at run time and are caught by the complier
     public void CalBill(){
       
        Random Ran = new Random();
        Order= Ran.nextInt(1000);
        
        // Set Method
         Set<Integer> set = new HashSet<>(); 
         boolean CustomerNum = set.add(1075);         
              
        //Seaching and Sorting
         List<Integer> OrderNum = Arrays.asList(101,211,105,113,201,109,108);    
         Collections.sort(OrderNum);  
         System.out.println(Collections.binarySearch(OrderNum, 3));
        
   
        // Declares an array list and is initialized
        // Using common collection methods
         ArrayList<String> Cashier = new ArrayList<>();  
         Cashier.add("Cahier Name : MARY");
         Cashier.add("Cahier Name : Barry");  
         Cashier.add("Cahier Name : LERATO");
         Cashier.add("Cahier Name : NATHI");   
         
         Cashier.remove("Cahier Name : Barry");
         Cashier.removeIf(s -> s.startsWith("L"));// Remove Condtionally If
         
         for(String Output :Cashier){
             System.out.println(Output); // loops collection to display
          }
         
         
        StringBuilder SB = new  StringBuilder();
        SB.append("Cashier serving customer");
        SB.append(Cashier.get(0)+" \n");
        SB.append(Cashier.get(1)+" \n");
        SB.append(Cashier.get(2)+" \n"); 
         
        SB.insert(4,"\n");
        SB.insert(6,"\n"); 
         
        
         // Creates 2 Dimentional array
        String[][]FoodMenu = new String[5][1];
             
                FoodMenu[0][0]="RIBS-R77";
                FoodMenu[1][0]="French Fries-R45";
                FoodMenu[2][0]="Skopo-R20";
                FoodMenu[3][0]="Hamburger-R15";
                FoodMenu[4][0]="Coldrink-R10";

            // initialize Variables
            int Quantity=0;
            int input=0;
            String Quan;
            String capture;
            int Selected_Item1;
             
       
             capture=JOptionPane.showInputDialog("Welcome to Jumpco Restuarant\nENTER 000 to QUIT\nMenu\t\nChoose your food\n1.RIBS-R77\n2.French Fries-R45\n3.Skopo-R20\n4.Hamburger-R15\n5.Coldrink-R10");
             Selected_Item1= Integer.parseInt(capture); 
             
             // uses a try block that goes in to a catch block to catch an exception
              try {
             if(Selected_Item1==1){
           
             Food=FoodMenu[0][0];
             Total=Total+77;
             Quan=JOptionPane.showInputDialog("Input Quantity OF ITEM");
             Quantity=Integer.parseInt(Quan);
        
              Total=Quantity*Total;
           }     
             else if(Selected_Item1==2){
           
          Total=Total+45;
          Food=FoodMenu[1][0];
          Quan=JOptionPane.showInputDialog("Input Quantity OF ITEM");
          Quantity=Integer.parseInt(Quan);
            
           Total=Quantity*Total;
      
            
       } else if(Selected_Item1==3){
           
          Total=Total+20;
          Food=FoodMenu[2][0];
          Quan=JOptionPane.showInputDialog("Input Quantity OF ITEM");
          Quantity=Integer.parseInt(Quan);
            
           Total=Quantity*Total;
       }
          else if(Selected_Item1==4){
           
          Total=Total+15;
          JOptionPane.showMessageDialog(null,"You Chose Food : "+FoodMenu[3][0]);
          Quan=JOptionPane.showInputDialog("Input Quantity OF ITEM");
          Quantity=Integer.parseInt(Quan);
            
            JOptionPane.showMessageDialog(null,"Bill for Hamburger R"+(Total=Quantity*Total));
            
         }  else if(Selected_Item1==5){
           
          Total=Total+10;
          JOptionPane.showMessageDialog(null,"You Chose Food : "+FoodMenu[4][0]);
          Quan=JOptionPane.showInputDialog("Input Quantity OF ITEM");
          Quantity=Integer.parseInt(Quan);
            
            JOptionPane.showMessageDialog(null,"Bill for Coldrink R"+(Total=Quantity*Total));
                 Order1(1);
            
            }}
              // Catches Checked exception
              catch (Exception e){
              JOptionPane.showMessageDialog(null, e.getMessage());
              
              }
              finally{}
              
              JOptionPane.showMessageDialog(null,"Order Number : "+Order);
             
             Order1(input);
              viewOrder(Order, Total,Food);
     }
    
      public static void viewOrder(int VOrder,int Bill,String Food){
        JOptionPane.showMessageDialog(null,"This is the order you placed with the following order Number \nOrder Number :"+VOrder+"\n\nFood Item Bought :"+Food+"\n\nTotal Bill :"+Bill);
    
    }
}
