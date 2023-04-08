/* PhoneNumber.java
 * Deep Patel
 * February 13th, 2018
 * Converting Phone number into easier format */

import java.util.Scanner;

public class phonenumber {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to read user inputs
  
  System.out.println("Enter a phone number:"); //user input
  String str = in.next();
  //next step allows program to add necessary adjustments to the user input number to make it easily readable.
  System.out.println("(" + str.substring(0,3) + ")" + str.substring(3,6) + "-" + str.substring(6,10)); //user output  
 }
}
//program completed
  