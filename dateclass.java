package myproject;
import java.util.*;

public class dateclass {
   public static void main(String[] args) {
	   Date d=new Date();
	   System.out.println("Current date is " +d);
	   int month=d.getMonth();
	   System.out.println(month);
	   int year=d.getYear();
	   System.out.println(year);
	   int minutes=d.getMinutes();
	   System.out.println(minutes);
	   int hours=d.getHours();
	   System.out.println(hours);
	       
   }
}
