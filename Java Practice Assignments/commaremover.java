/* commaremover.java
 * Deep Patel
 * February 13th, 2018
 * Printing large user entered numbers without commas */

import java.util.Scanner;

public class commaremover {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  
  System.out.print("Please enter a number between 1,000 and 999,999:");
  String str = in.next();
  
  System.out.println(str.substring(0) + str.substring(1,4));
  }
}
    
  