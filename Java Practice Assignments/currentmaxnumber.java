import java.util.Scanner;

public class currentmaxnumber {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  
  int num = 0;
  int max = 0;
  
  while(num <= 0) {
    System.out.println("Enter number:");
    num++; 
    max++;
  }
  if(max > num) {
   System.out.println("The current max is: " + max);
  }
  }
}
  