import java.util.Scanner;
import java.lang.Math;
import javax.swing.*;

public class GUIsqRoot {
  public static void main(String[] args) {
  
  Scanner in = new Scanner(System.in);
  
    int number;
    boolean more = true; 
    while(more) {
      System.out.print("Enter an integer: ");
      number = in.nextInt();
      System.out.println("Square Root of " + number + " is " + Math.sqrt(number));
      more = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
                                                                     "Would you like to enter another number?",
                                                                     "Square Root", JOptionPane.YES_NO_OPTION);
    }
      if(more == true) {
      int reply = JOptionPane.showConfirmDialog(null, "Time to Quit?");
      }
      
    }
  }
 

      