/* fastfood.java
 * Deep Patel
 * February 14th, 2019 */

import java.util.Scanner;

public class fastfood {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to read user inputs
  
  System.out.println("Enter the number of burgers:"); //user input for burgers
  int burg = in.nextInt();
  
  System.out.println("Enter the number of fries:");//user input for fries
  int fry = in.nextInt();
  
  System.out.println("Enter the number of sodas:");//user input for sodas
  int sod = in.nextInt();
  
  double burgers = burg * 1.69; //calculating burger costs
  double fries = fry * 1.09; //calculating fries costs
  double sodas = sod * 0.99; // calculating soda costs
  
  double total =  burgers + fries + sodas; //combining above prices
  double tax = total * 0.13; //calculating tax to total price
  double cost = total + tax; //adding the total cost and the tax to obtain final cost
  
  System.out.printf("Total before tax: $%.2f", + total); //user output of total before tax
  System.out.printf("\nTax: $%.2f", + tax); //user output for tax amount
  System.out.printf("\nFinal Total: $%.2f", + cost); //user output for final total
  
  System.out.print("\nEnter amount tendered:");
  double tend = in.nextDouble();
  
  double realcost = tend - cost;
  System.out.printf("Change: $%.2f", + realcost);
  
  if(tend < realcost);
    System.out.println("\nNot Enough! Pay More!");
  }
}
//program completed