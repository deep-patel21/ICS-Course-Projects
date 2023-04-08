/* prices.java
 * Deep Patel
 * February 27th, 2019
 * program which calculates the price of copies to print and the total price for the job*/

import java.util.Scanner; //imports the scanner function
public class prices {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read inputs from the user
  
  System.out.println("Enter the number of copies to be printed:"); //user output for the number of copies that need to be printed
  int num = in.nextInt();
  
  if(num >= 0 && num <= 99) { //declaring scenario for 0 to 99 copies
    System.out.println("Price per copy is $0.30"); //user output for copying price
    System.out.println("Total cost is " + num * 0.30); //user output for the price they have to pay
  }
   
  if(num >= 100 && num <= 499) { //declaring scenario for 100 to 499 copies
    System.out.println("Price per copy is $0.28"); //user output for copying price
    System.out.println("Total cost is " + num * 0.28); //user output for the price they have to pay
  }
  
  if(num >= 500 && num <= 749) { //declaring scenario for 500 to 749 copies
    System.out.println("Price per copy is $0.27"); //user output for copying price
    System.out.println("Total cost is " + num * 0.27); //user output for the price they have to pay
  }
  
  if(num >= 750 && num <=1000) { //declaring scenario for 750 to 1000 copies
    System.out.println("Price per copy is $0.26"); //user output for copying price
    System.out.println("Total cost is " + num * 0.26); //user output for the price they have to pay
  }
  
  if(num > 1000) { //declaring scenario for copies over a 1000 
    System.out.println("Price per copy is $0.25"); //user output for copying price
    System.out.printf("Total price is $%.2f ", + num * 0.25); //user output for the price they have to pay
  }
  }
}
//program completed
  
    