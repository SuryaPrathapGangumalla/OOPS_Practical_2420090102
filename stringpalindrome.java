package myproject;
import java.util.*;
public class stringpalindrome {
             public static void main(String[] args) {
            	 Scanner sc=new Scanner(System.in);
            	       System.out.println("enter a string ");
            	       String str=sc.nextLine();
            	       StringBuilder sb=new StringBuilder(str);
            	       sb.reverse();
            	       if(str.contentEquals(sb))
            	    	   System.out.println("this is palindrome");
            	       else
            	    	   System.out.println("this is not palindrome");
            	       
             }
}
