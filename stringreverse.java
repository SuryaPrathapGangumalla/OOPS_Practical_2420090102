package myproject;
import java.util.*;
public class stringreverse {
                  public static void main(String[] args) {
                	 Scanner sc=new Scanner(System.in);
                	 System.out.println("enter a string");
                	 String str=sc.nextLine();
                	 StringBuilder sb=new StringBuilder(str);
                	 System.out.println(sb.reverse());
                  }
}
