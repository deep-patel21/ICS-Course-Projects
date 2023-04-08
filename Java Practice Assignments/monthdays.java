/* monthdays.java
 * Deep Patel
 * February 27th, 2019
 * Program which takes user input for the month number and displays
   the number of days in the month selected */

import java.util.Scanner; //imports the scanner function
public class monthdays {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows the program to read inputs from the user
  
  System.out.println("Enter a month. (1 for Jan, 2 for Feb and so on..):"); //user output for instructions
  int num = in.nextInt();
  
  if(num == 1) { //for January
    System.out.println("January has 31 days."); //user output for number of days
  }
  
  if(num == 2) { //for February
    System.out.println("February has 28 days."); //user output for number of days
  }
  
  if(num == 3) { //for March
    System.out.println("March has 31 days."); //user output for number of days
  }
  
  if(num == 4) { //for April
    System.out.println("April has 30 days."); //user output for number of days
  }
  
  if(num == 5) { //for May
    System.out.println("May has 31 days."); //user output for number of days
  }
 
  if(num == 6) { //for June
    System.out.println("June has 30 days."); //user output for number of days
  }
  
  if(num == 7) { //for July
    System.out.println("July has 31 days."); //user output for number of days
  }
  
  if(num == 8) { //for August
    System.out.println("August has 31 days."); //user output for number of days
  }
  
  if(num == 9) { //for September
    System.out.println("September has 30 days."); //user output for number of days
  }
  
  if(num == 10) { //for October
    System.out.println("October has 31 days."); //user output for number of days
  }
 
  if(num == 11) { //for November
    System.out.println("November has 30 days."); //user output for number of days
  }
  
  if(num == 12) { //for December
    System.out.println("December has 31 days."); //user output for number of days
  }
  
  if(num > 12) { //for the user if they enter a number above 12
    System.out.println("There are only 12 months in the year. Try another number between 1 and 12.");
  }
  }
}
//program completed