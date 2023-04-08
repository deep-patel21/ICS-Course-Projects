/* ArraysChallenge.java
 * Deep Patel
 * April 17th, 2019
 * Creating an array of 10 and replacing all of the values with -1 */

import java.util.Scanner;

public class ArraysChallenge {
  public static void main(String[] main) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Program initializeArray");
    int[] nums = new int[10];
    nums = initializeArray(nums);
    
    for (int i = 0; i < 10; i++) {
      System.out.print(nums[i]);
    }
    System.out.println("\n");
    System.out.println("Program changeArray"); 
    int[] numbers = new int[10];
    numbers = changeArray(numbers,1,2,3,4,5,6,7,8,9,10);
  }
  {
  System.out.println("\n"); 
  System.out.println("Program checkerBoard");
  
  Scanner in = new Scanner(System.in);
  
  System.out.println("Enter array dimesion one: ");
  int user1 = in.nextInt();
  System.out.println("Enter array dimension two: ");
  int user2 = in.nextInt();
    
  int[][] grid = new int[user1][user2];
  grid = checkerBoard(grid,0,1);
}

public static int[] initializeArray(int[] nums) {
  for (int i = 0; i < 10; i++) {
    nums[i] = -1;
  }
  return nums;
}

public static int[] changeArray(int[] numbers, int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
  numbers[0] = n1;
  numbers[1] = n2;
  numbers[2] = n3;
  numbers[3] = n4;
  numbers[4] = n5;
  numbers[5] = n6;
  numbers[6] = n7;
  numbers[7] = n8;
  numbers[8] = n9;
  numbers[9] = n10;
  
  System.out.print(n1 + " ");
  System.out.print(n2 + " ");
  System.out.print(n3 + " ");
  System.out.print(n4 + " ");
  System.out.print(n5 + " ");
  System.out.print(n6 + " ");
  System.out.print(n7 + " ");
  System.out.print(n8 + " ");
  System.out.print(n9 + " ");
  System.out.print(n10 + " ");
  
  
  return numbers;
}
public static int[][] checkerBoard(int[][] grid, 0, 1) {
  
}
}

  

  
  


