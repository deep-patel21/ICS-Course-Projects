import java.util.Scanner;

public class conversion {
  public static void main(String [] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the distance in meters:");
    double meters = in.nextInt();
    
    double feet = meters * 3.28;
    double inches = meters * 39.37;
    
    System.out.println("The distance in feet is " + feet + ".");
    System.out.println("The distance in inches is " + inches + ".");
  }
}