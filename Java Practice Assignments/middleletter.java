/*middleletter.java
 * Deep Patel
 * March 21st, 2019
 * Program which finds the middle letter of a word entered by the user.*/

import java.util.Scanner;

public class middleletter { 
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read inputs from the user

  System.out.println("Enter word:");
  String str = in.next();
  
  System.out.println(str.substring(str) + str.length(1,4));
  
  if(word == str.length(2,4,6, 8, 10, 12)){ //statement to decide if the length of the word is even
   
    System.out.println("This word has no middle letter."); //user output for no middle letter
  }
}
}