/*Receipt.java
 * Deep Patel
 * February 11th, 2019
 * Program which produces restaurant receipt based on user input */ 

import java.util.Scanner;

public class receipt {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
    
  System.out.println("Enter price of appetizer:"); //user input
  int app = in.nextInt(); //defining variable app
  
  System.out.println("Enter price of main course:"); //user input
  int main = in.nextInt(); //defining variable main
  
  System.out.println("Enter price of dessert:"); //user input
  int dess = in.nextInt(); //defining variable dess
  
  int total = app + main + dess;//calculation of subtotal
  double hst = total * 0.13; //calculation of hst
  double srvchrg = total * 0.15;//calculation of service charge
  double finale = hst + srvchrg + total; // calculation of final price
  
  System.out.println("Your subtotal is: " + total + ".");//user output
  System.out.println("The 13% HST is: " + hst + "."); //user output
  System.out.println("The 15% Service Charge is: " + srvchrg + ".");//user output
  System.out.println("The final price is: " + finale + ".");
  }
}