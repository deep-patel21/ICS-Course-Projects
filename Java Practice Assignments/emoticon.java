/* emoticon.java
 * Deep Patel
 * February 27th, 2019
 * program which calculates the price of copies to print and the total price for the job*/

import java.util.Scanner; //imports the scanner function
public class emoticon   {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read inputs from the user
  
  System.out.println("Enter an emoticon you would like to display: "); //user input for an emote they would like to display
  String emote = in.next();
  
  if(emote.equals("happy")) { //declaring emote happy
    System.out.println(":)"); //user output for happy emote
  }
  
  if(emote.equals("sad")) { //declaring emote sad
    System.out.println(":("); //user output for sad emote
  }
  
  if(emote.equals("angry")) { //declaring emote angry
    System.out.println(":X"); //user output for angry emote 
  }
  
  if(emote.equals("surprised")) { //declaring emote surprised
    System.out.println(":O"); //user output for surprised emote
  }
  
  if(emote.equals("funny")) { //declaring emote funny
    System.out.println(":P"); //user output for funny emote
  }
  }
}
//program completed