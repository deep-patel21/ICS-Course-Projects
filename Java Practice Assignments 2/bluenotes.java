/* bluenotes.java
 * Deep Patel
 * February 27th, 2019
 * program which calculates the price of copies to print and the total price for the job*/

import java.util.Scanner; //imports the scanner function
public class bluenotes  {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read inputs from the user
  
  System.out.println("Please input the subtotal of your shopping cart: "); //user input for the subtotal of the their shopping cart
  double subtotal = in.nextDouble();
    
  //starting the brace for the scenario if price is 59.99 or less
  if(subtotal <= 59.99) { //declaring scenario for price if it is 59.99 or less
    System.out.println("A standard shipping charge of $5.00 will be applied."); //user output for the amount of shipping they need to pay for
  
  
  double plusshipping = subtotal + 5; //calculating the price with shipping charges included
  double tax = plusshipping * 0.13; //calculating the amount of tax the person will have to pay 
  double total = tax + plusshipping; //calculating the final price they will have to pay including shipping and tax
  
  System.out.printf("\nThe amount of tax you have to pay is: $%.2f ", + tax); //user output for the amount of tax they will have to pay
  System.out.printf("\nThe final amount you have to pay is: $%.2f ", + total);//user output for the final amount they will haev to pay including shipping and tax
  } //closing the brace for the scenario if price is 59.99 or less
  
    //opening the brace for the scenario if price is 60.00 or above
    if(subtotal >= 60.00) {
      System.out.println("\nYou qualify for free shipping!");
  
  
      double taxtwo = subtotal * 0.13; //calculating the tax amount for the second scenario
      double totaltwo = subtotal + taxtwo; //calculating the final price for the second scenario
  
      System.out.printf("\nThe amount of tax you have to pay is: $%.2f ", + taxtwo); //user output for the amount of tax they will have to pay
      System.out.printf("\nThe final amount you have to pay is: $%.2f ", + totaltwo); //user output for the final amount they will have to pay
  } //closing the brace for the scenario if price isw 60.00 or above
  }
}
//program completed
      