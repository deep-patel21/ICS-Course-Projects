/* methodreview.java
 * Deep Patel
 * April 23rd, 2019
 * Program which contains lots of methods for review */

import java.util.Scanner;
import java.util.Random; 

public class MethodReview {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("Dimensions must be under 10.");
    System.out.println("Enter dimension one: ");
    int dim1 = in.nextInt();
    System.out.println("Enter dimension two: ");
    int dim2 = in.nextInt();
    
    displayRectangle(dim1, dim2);
    System.out.println("\nProgram completed.");
    
    
    System.out.println("Coin counter");
    System.out.println("Enter the number of nickels: ");
    int nickels = in.nextInt();
    System.out.println("Enter the number of dimes: ");
    int dimes = in.nextInt();
    System.out.println("Enter the number of quarters: ");
    int quarters = in.nextInt();
    System.out.println("Enter the number of loonies: ");
    int loonies = in.nextInt();
    System.out.println("Enter the number of toonies: ");
    int toonies = in.nextInt();
    
    getAmount(nickels,dimes,quarters,loonies,toonies);
    System.out.println("Program completed"); 
    
    System.out.println("Lottery Winner!");
    System.out.println("Enter a 7-digit number:");
    int digits = in.nextInt();
    
    int[] myArray = new int[7];
14
    for(int i = 0; i < 7; i++);
      int nums = rand.nextInt(9); 
      System.out.println(rand.nextInt(9));
    

    if(digits == nums) {
      System.out.println("You won the lottery");
    }
    if(digits != nums) {
      System.out.println("You did not win the lottery.");
    }
    
    
  }
  
  public static void displayRectangle(int dim1, int dim2) {
    for(int i = dim1; i > 0; i--) {
      System.out.print("-");
      for(int j = dim1; j < dim1 - 2; j--){
        System.out.print("|");
      }
    }
  }
  
  public static void getAmount(int dimes, int nickels, int quarters, int loonies, int toonies) {
    
  }
}

