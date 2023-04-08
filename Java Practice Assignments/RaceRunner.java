import javax.swing.*;
import java.util.Scanner;

public class RaceRunner {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the name of runner 1: ");
    String runner1 = in.next();
    
    System.out.println("Enter the name of runner 2: ");
    String runner2 = in.next();
    
    System.out.println("Enter the time in seconds for runner 1: ");
    int time1 = in.nextInt();
    
    System.out.println("Enter the time in seconds for runner 2: ");
    int time2 = in.nextInt();
    
    if(time1 < time2) {
    JOptionPane.showMessageDialog(null, runner1 + " " +time1 + "s\n" + runner2 + " " + time2 + "s",
                                  "Winner is Runner 1!", JOptionPane.INFORMATION_MESSAGE);
  }
  else if (time2 < time1) {
    JOptionPane.showMessageDialog(null, runner1 + " " + time1 + "s\n" + runner2 + " " + time2 + "s",
                                  "Winner is Runner 2!", JOptionPane.INFORMATION_MESSAGE);
  }
  else {
    JOptionPane.showMessageDialog(null,  runner1 + " " + time1  + "s\n" + runner2 + " " +   time2 + "s",
                                  "The race is a tie", JOptionPane.INFORMATION_MESSAGE);
  }
  double average = (time1 + time2)/2;
  JOptionPane.showMessageDialog(null, average + " " + "seconds",
                                "Average Time" , JOptionPane.INFORMATION_MESSAGE);
  }
}

  
