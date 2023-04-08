import java.util.Scanner;

public class numbercalc {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter your first integer:");
    int one = in.nextInt();
    
    System.out.println("Enter your second integer:");
    int two = in.nextInt();
    
    int sum = one + two;
    System.out.println("The sum is " + sum + ".");
    
    int diff = one - two;
    System.out.println("The difference is " + diff + ".");
    
    int prod = one * two;
    System.out.println("The product is " + prod + ".");
    
    System.out.println("The larger number is " + Math.max(one, two));
  
    System.out.println("The smaller number is " + Math.min(one, two));
  }
}