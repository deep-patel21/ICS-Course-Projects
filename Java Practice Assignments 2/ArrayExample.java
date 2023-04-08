import java.util.Scanner;

public class ArrayExample {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int[] nums = new int[10];
    int n;
   
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter a number: ");
      n = in.nextInt();
      nums[i] = n;
    }

    for (int i = 0; i < 10; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}