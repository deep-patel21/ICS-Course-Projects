/* bellringertwo.java
 * Deep Patel
 * February 21st, 2019 
 * program which determines the number of boxes, cartons and number of leftover cookie boxes after a sale*/

import java.util.Scanner; //importing the scanner function so user inputs can be read

public class bellringertwo{
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to read user inputs
  
  System.out.println("Enter the number of cookies produced:"); //user input for the number of cookies produced
  int num = in.nextInt();
  
  int boxes = num/12; //calculating the number of boxes
  int cartons = boxes/24; //calculating the number of cartons
  int leftover = num/boxes; //calculating the number of leftover boxes outside a carton
  
  
  System.out.println("Number of boxes: " + boxes); //user output for the number of boxes
  System.out.println("Number of cartons: " + cartons); //user output for the number of cartons
  System.out.println("Number of leftover boxes: " + leftover); //user ouput for the number of leftover boxes outside the cartons
  
  double money = (boxes * 1.15) + (leftover * 0.60); //calculating the amount of money made
  System.out.printf("The total money made is: $%.2f", + money); //user output for the amount of money made
  }
}
//program completed
  
  