/* currentmax.java
 * Deep Patel
 * March 19th, 2019\
 * Program which give the user the current maximum number from a number they add to a list at different steps. */
import java.util.Scanner;
public class currentmax {
  public static void main (String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to read user input
  
  int max = 0;
  num = -1;
  while(num != -1) { //setting up a while loop
    System.out.println("Enter a number: ");
    int num = in.nextInt();
    
    if(num > max) { //comparing the number entered to max
      max = num; //if the number entered was greater than the currentmax in comparing, the max number is replaced by the entered number.
    }
  }
}
                    
  
  