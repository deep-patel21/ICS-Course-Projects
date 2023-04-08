/* nameprint.java
 * Deep Patel
 * February 13th, 2018
 * Printing letternames in an improved way */

import java.util.Scanner;

public class nameprint {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to get user inputs
  
  final String LETTER_H = "*  *\n*  *\n****\n*  *\n*  *\n"; //letter h sequence
  System.out.println(LETTER_H); //user output for letter h
  
  final String LETTER_E = "****\n*\n*\n****\n*\n*\n****"; //letter e sequence
  System.out.println(LETTER_E); //user output for letter e
  
  final String LETTER_L = "\n*\n*\n*\n*\n****\n\n*\n*\n*\n*\n****"; //letter l sequence, repeated twice beacause we can not have two strings with the same declaration.
  System.out.println(LETTER_L); //user output for two letter l's
 
  final String LETTER_O = "\n ***\n*   *\n*   *\n*   *\n*   *\n ***"; //letter o sequence
  System.out.print(LETTER_O); //user output for letter o
  }
}
//program complete