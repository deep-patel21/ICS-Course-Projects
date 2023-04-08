/* lightbulb.java
 * Deep Patel
 * April 4th, 2019
 * Lightbulb Solitaire Game in which the player needs to turn all of the lightbulbs off. */ 

//The value of 1 will represent a lightbulb that is lit.
//The value of 0 will represent a lightbulb that is off.

import java.util.Scanner;
import java.util.Random;

public class lightbulbsolitaire {
  public static void main(String[] args) {
  
  Scanner in = new Scanner(System.in);
  Random rand = new Random();  
  
  //introduction of the game for the player
  System.out.println("Welcome to Lightbulb Solitaire!!!");
  //Rules and Regulations of the game
  System.out.println("\nRules of the Game:");
  System.out.println("Enter the x and y coordinates the change the gameboard.");
  System.out.println("The goal is to turn off all the lights. Have fun!");
  System.out.println("The game will be more challenging as the lightbulbs adjacent to your selction will also change state.");

  int[][] lights  = new int[5][5];
  int n;
  
 
  for(int i = 0; i < 5; i++) {
    for(int j = 0; j < 5; j++)
      System.out.print(rand.nextInt(2));
    System.out.println();
   }   
 
  }
}
      