/* twovalues.java
 * Deep Patel
 * February 22nd, 2018
 * Program which asks the value of a and b and then determines if a is a multiple of b */

import java.util.Scanner; //imports the scanner function
  
public class twovalues {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read user inputs
  
  System.out.println("Enter the value of variable a: ");
  int vara = in.nextInt();
  
  System.out.println("Enter the value of variable b: ");
  int varb = in.nextInt();
 
  if (vara/varb) {
    System.out.println("A is a multiple of B");
  }
   
  if (vara/varb) {
    System.out.println("A is NOT a multiple of B");
  }
  }
}