package jumpcorestuarant;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Innocent Mcineka1
 */

public class DateClass {
    public static void main(String args[]){
        
        LocalDateTime DateTime =LocalDateTime.now();
        System.out.println(DateTime);
        
        LocalDate Date= LocalDate.now();
        System.out.println("Date "+Date);
        
        LocalTime Time = LocalTime.now();
        System.out.println("Time "+Time);
        
        // Date time Formatter
        DateTimeFormatter DateFormat= DateTimeFormatter.ofPattern("dd MM yyyy HH mm ss");
        System.out.println(DateTime.format(DateFormat));
        
        Period Prd= Period.ofDays(30);
        System.out.println("Period : "+Prd);
        
        LocalTime start = LocalTime.of(1, 20, 25, 1024);
        LocalTime end = LocalTime.of(3, 22, 27, 1544);
 
        System.out.println("Duration  "+Duration.between(start, end).getSeconds());  
      
        // Daytime saving
     /*   ZoneId.of( "America/Montreal" )
        .getRules().isDaylightSavings(Instant.now());    
        
        // Picking a locale
        Locale.setDefault(new Locale("Germany"));
        ResourceBundle rb = ResourceBundle.getBundle("Africa", new Locale("Africa"));
        
        Locale l1 = new Locale.Builder()
        .setLanguage("en")
        .setRegion("South Africa")
        .build();
        
         // Resource bundle
	System.out.println("Current Locale: " + Locale.getDefault());
	ResourceBundle mybundle = ResourceBundle.getBundle("MyLabels");
	System.out.println("Say how are you in US English: " + mybundle.getString("how_are_you"));*/
        
         // Formatting Numbers
        Locale locale = new Locale("da", "DK");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String number = numberFormat.format(100.99);
        System.out.println(number);
        
        
        
    }
}
