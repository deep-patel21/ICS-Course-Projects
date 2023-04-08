/* numclass.java
 * Deep Patel
 * February 22nd, 2018
 * Program which classifies if a user input integer is positive, negative or has a value of zero */

import java.util.Scanner; //imports the scanner function
  
public class numclass {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read user inputs
    
  System.out.println("Enter an integer:"); //user input for an integer
  int num = in.nextInt();
  
  if(num == 0) { //if statement for if the number is equal to the value of zero
    System.out.println("Result: Zero"); //user output if the value of zero is entered
  }
    
  if(num >= 1) { //if statement for if the number is greater than or equal to the value of one
    System.out.println("Result: Positive"); //user output if the value of a number one of greater is entered
  }
      
  if(num <= -1) { //if statement is the number entered has a value of negative one of less
    System.out.println("Result: Negative"); //user output for if the value of the number entered is -1 or less
   }
  }
}
//program completed