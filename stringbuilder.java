package myproject;
import java.util.*;
public class stringbuilder {
               public static void main(String[] args) {
            	   StringBuilder sb2=new StringBuilder();
            	   StringBuilder sb1=new StringBuilder("this is KLH");
            	   Scanner sc=new Scanner(System.in);
            	   System.out.println("enter a string");
            	   String str=sc.nextLine();
            	   StringBuilder sb=new StringBuilder(str);
            	   sb.append("hello");
            	   System.out.println(sb);
            	   
            	   System.out.println(sb.insert(3, "hello"));
            	   System.out.println(sb1.reverse());
            	   
            	   System.out.println(sb.replace(1,6,"java"));
            	   System.out.println(sb.delete(5,10));
            	   System.out.println(sb2.capacity());
            	   sb1.setCharAt(2, 'a');
            	   System.out.println(sb1);
            	   System.out.println(sb1.substring(5));
            	   System.out.println(sb1.substring(6,10));
            	   System.out.println(sb.deleteCharAt(5));
            	   String str1=sb.toString();
            	   System.out.println(str1);
               }
}
