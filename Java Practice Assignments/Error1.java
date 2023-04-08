import java.util.Scanner;
public class Error1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of quarters: ");
    int quarters = in.nextInt();
    if (quarters >= 0) {
      total = total + quarters * 0.25;
      System.out.println("Total: " + total);
    }
    else{
        System.out.println("Input error.");
    }
  }
}
      
                      