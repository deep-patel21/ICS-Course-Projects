import java.util.Scanner;
public class square { 
  public static void main(String[] args) {
       
    Scanner in = new Scanner(System.in);
        
    System.out.println("What is the side length?: ");
    int area = in.nextInt();
      
    int total = area * 4;
    System.out.println("The area of the square is " + total + ".");
  }
}