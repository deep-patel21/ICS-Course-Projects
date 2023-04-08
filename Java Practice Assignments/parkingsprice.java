/* parkingprice.java
 * Deep Patel
 * March 21st, 2019
 * Program which took a for loop and converts it into a while loop */

import java.util.Scanner;

public class parkingsprice { 
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
 
  System.out.println("Enter time:");
  int time = in.nextInt();
  
  int price = 0;
  
  if(time <= 60) {
    price = time/30;
    System.out.println("Price: " + price);
  }
  }
}