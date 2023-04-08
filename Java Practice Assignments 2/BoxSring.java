/* boxstring.java
 * Deep Patel
 * April 2019
 * Program to box off a word inputted by user using hypens ascii */

import java.util.Scanner; 

public class BoxSring {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a word to be boxed: ");
    String word = in.next();
    boxoff(word);
    System.out.println("\nThis program has finished its job!");
    
  }
}
}