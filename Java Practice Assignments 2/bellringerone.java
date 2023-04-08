/* bellringerone.java
 * Deep Patel
 * February 21st, 2019 
 * Program which calculates the area, perimeter of a square and the volume and surface area of a cube */

import java.util.Scanner; //importing the scanner function so user inputs can be read

public class bellringerone {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in); //allows program to read user inputs
  
  System.out.println("Enter the side length of a square in cm:"); //user input for square side length
  int side1 = in.nextInt();
  
  int area = side1 * side1; //calculating the area of the square
  int peri = side1 * 4; //calculating the perimeter of the square
  
  System.out.println("Enter the side length of a cube:"); //user input for cube side length
  int side2 = in.nextInt();
  
  int volume = side2 * side2 * side2; //calculating the volume of the cube
  int surfa = (side2 * side2) * 6; //calculating the surface area of the cube
  
  System.out.println("The area of the square is: " + area + " cm2."); //user output for the area of the square
  System.out.println("The perimeter of the square is: " + peri + " cm."); //user output for the perimeter of the square
  
  System.out.println("\nThe volume of the cube is: " + volume + " cm3"); //user output for the volume of the cube
  System.out.println("The surface area of the cube is: " + surfa + " cm2"); //user output for the surface area of the cube
  
  //ascii art of a square (not to scale)
  System.out.println(" -------- ");
  System.out.println("|        |");
  System.out.println("|        |");
  System.out.println("|        |");
  System.out.println(" -------- ");
  }
}
//program completed
