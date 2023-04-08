/* patternd.java
 * Deep Patel
 * March 25th, 2019
 * Program which prints pattern d from Not a Bad Fit, Banana Split*/

public class patternd {
  public static void main(String[] args) {
   
   for(int j = 1; j < 10; j++) { //this value counts the number of j, the variable used to indicate number the program counts up to
     for(int i = 1; i < j; i++) //i starts at 1 at repeats until it reaches the final value of j
     System.out.print(i + " "); //prints i with a space next to it
     System.out.println(); //used to create a new line after each sequence prints
   } 
 }
}
//program completed
