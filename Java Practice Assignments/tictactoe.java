/* tictactoe.java
 * Deep Patel
 * February 13th, 2018
 * Printing a tic tac toe grid using ascii art */

import java.util.Scanner;

public class tictactoe {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to read user inputs
  
  String symOne = "+--+--+--+"; //defining the first row of symbols
  String symTwo = "|  |  |  |"; //defining the second row of symbols
  String grid = symOne + "\n" + symTwo + "\n" + symOne + "\n" + symTwo + "\n" + symOne + "\n" + symTwo + "\n" + symOne;;;//allows the program to calculate two rows after each other by using \n to skip to the next row down
  
  System.out.println(grid);
  }
}
//program completed