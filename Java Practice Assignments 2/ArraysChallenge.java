/* ArraysChallenge.java
 * Deep Patel
 * April 17th, 2019
 * Creating an array of 10 and replacing all of the values with -1 */



public class ArraysChallenge {
  public static void main(String[] main) {
    
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
    
    System.out.println("\n");
    System.out.println("Program checkerBoard");
    int[] grid = new int[10];
    grid = checkerBoard(numbers);
    
    System.out.println("\n");
    System.out.println("Program sumElements");
    int[] sumgrid = new int[10];
    sumgrid = 7sumElements[grid];
    
    System.out.println("\n");
    System.out.println("Program display");
    int [] display = new int[10];
    display = programDisplay(sumgrid);
    
    System.out.println("\n");
    System.out.println("Program findElement");
    int[] findx = new int[10];
    findx = newElement(display);
    
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
  
  public static int[] checkerBoard(int[] grid) {
    grid[0] = 0;
    grid[1] = 1;
    grid[2] = 0;
    grid[3] = 1;
    grid[4] = 0;
    grid[5] = 1;
    grid[6] = 0;
    grid[7] = 1;
    grid[8] = 0;
    grid[9] = 1;
    
    System.out.print(grid[0]);
    System.out.print(grid[1]);
    System.out.print(grid[2]);
    System.out.print(grid[3]);
    System.out.print(grid[4]);
    System.out.print(grid[5]);
    System.out.print(grid[6]);
    System.out.print(grid[7]);
    System.out.print(grid[8]);
    System.out.print(grid[9]);
    
    return grid;
  }
  
  public static int[] sumElements(int[] sumgrid){
    int total = sumgrid[0] + sumgrid[1] + sumgrid[2] + sumgrid[3] + sumgrid[4] + sumgrid[5] + sumgrid[6] + sumgrid[7] + sumgrid[8] + sumgrid[9];
    System.out.println("Sum of Grid: " + total);
    
    return sumgrid;
  }
  
  public static int[] programDisplay(int[] display){
    System.out.print(display[0] + " ");
    System.out.print(display[1] + " ");
    System.out.print(display[2] + " "); 
    System.out.print(display[3] + " "); 
    System.out.print(display[4] + " "); 
    System.out.print(display[5] + " ");   
    System.out.print(display[6] + " "); 
    System.out.print(display[7] + " "); 
    System.out.print(display[8] + " ");
    System.out.print(display[9]);
    
    return display;
    
  }
  
  import java.util.Scanner;
  public static int[] findElement(int[]findx) {
  System.out.println("Enter an index: ");
  int user = in.nextInt();
  
  for(int i = 0; i < findElement.length; i++) {
    if(user == findElement[i]) {
      System.out.println("This array contains the inputted value."):
        else {
        System.out.println("This array DOES NOT contain the inputted value."):
      }
    }
  }
    
    
    
    
    
//program complete
    
    
    
    
    
    
    
    
    
