/* guessgame.java
 * Deep Patel
 * February 27th, 2019
 * program which calculates the price of copies to print and the total price for the job*/

import java.util.Scanner; //imports the scanner function


public class guessgame {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read inputs from the user
  int random = (int)(Math.random() * 20 + 1); //function which allows the program to pick a random number
 
  System.out.println("A secret number has been determined!"); //user output declaring that a random number has been determined
  System.out.println("\nGuess:"); //input for guess number one
  int guess = in.nextInt();
  
  if(guess < random) { //declaring scenario for if user guess if lower that determined number
    System.out.println("Incorrect. Guess a higher number."); //user output for incorrect number, need a higher case
  }
  
   else if(guess > random) { //declaring scenario for if user guess in higher thatn the determined number
    System.out.println("Incorrect. Guess a lower number."); //user output for incorrect number, need a lower case
  }
    
  if(guess == random) { //declaring scenario for if the user guesses the number correctly
    System.out.println("You Won!"); //user output for the scenario where the user wins the game
  }
 
 
  //process repeats the same way for the second guess if the user has not already guessed the number
  System.out.println("\nGuess:");
  int guesstwo = in.nextInt();
  
  if(guesstwo < random) {
    System.out.println("Incorrect. Better luck next time.");
  
  if(guesstwo > random) 
    System.out.println("Incorrect. Better luck next time.");
  
  
  if(guesstwo == random) 
    System.out.println("You Won!");
  }
  }                       
}
//program completed



  