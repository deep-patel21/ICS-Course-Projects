y/* createarray.java
 * Deep Patel
 * March 26th, 2019
 * Program which uses the random function to generate 10 random numbers in an array */

import java.util.Random;
import java.util.Scanner;

public class createarray {
  public static void main(String[] args) {
    
  Random rand = new Random();
  Scanner in = new Scanner(System.in);
  
  int[] nums = new int[10];
  int n;
  
  for(int i = 0; i < 10; i++) {
    System.out.println("Enter a number: ");
    n = in.nextInt();
    nums[i] = n;
  }
  
  for(int i = 0; i < 10; i++) {
    System.out.print(nums[i]);                              
   
   
  }
  
  
  }
}
  