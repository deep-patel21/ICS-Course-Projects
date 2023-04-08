/* parkingprice.java
 * Deep Patel
 * March 21st, 2019
 * Program which takes user input for time and converts in to the price they need to pay for parking */

import java.util.Scanner;

public class parkingprice { 
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
 
  System.out.println("Enter time:"); //user input for the time they want to park for
  int time = in.nextInt();
  
  int price = 0; //declaring price as 0
  int hour = 60; //declaring the number of minutes in one hour
  
  while(time != 0) { //until the time 0 is not entered this loop will repeat
    price = time/hour; //calculating the price
  }
    
  System.out.print(price); //user output for the price they have to pay
  
  }
}
//program completed


    
    
  
    