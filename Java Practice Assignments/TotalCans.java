import java.util.Scanner;

public class TotalCans {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter the number of cans per box:");
    int cans = in.nextInt();
    System.out.print("Please enter the number of boxes:");
    int boxes = in.nextInt();
    
    int total = cans * boxes;
    System.out.println("There are " + total + " cans in total.");
  }
}