/* shout.java
 * Deep Patel
 * April 2019
 * Program to investigate shout statments in methods */

import java.util.Scanner;

public class shout {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("This program tests a shout method!"); //user output for whst the program performs
    System.out.println("It will print hello 3 times.");
    
    System.out.println("Enter a word: "); //user input for word
    String word = in.next();
    System.out.println("Enter a number: "); //user input for a number
    int num = in.nextInt();
    shout(word,num); //calling on method of shout
    System.out.println("The program has finished its job"); //user output for the end of the program
    
    public static void shout(String word, int num);
      
  }
}