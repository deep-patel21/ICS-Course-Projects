
import java.util.Scanner;

public class highestnumber {
  public static void main(String[] args) {
   
    
  Scanner in = new Scanner(System.in);
  
  count = 0;
  num = 0;
  
  System.out.println("Please enter a number:");
  int numb = in.nextInt();
  
  while(num >= numb) {
    System.out.println("Highest number is " + num);
    count = count + 1;
  }
  
  }
}