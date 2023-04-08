/* ChocolateChipCookie.java
 * Deep Patel
 * February 11th, 2019
 * Program which calculates ingredients for a recipe */

import java.util.Scanner;

public class cookie {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  
  System.out.println("How many cookies are you making(batches of 30)?:");
  int num = in.nextInt();
  
  System.out.println("To make " + num + " cookies, you will need...");
  
  double flour = num * 2.25;
  double butter = num * 1.25;
  double sugar = num * 0.75;
  int vanilla = num * 1;
  int baksoda = num * 1;
  double brosugar = num * 0.75;
  int eggs = num;
  int chips = num * 1;
  
  System.out.println(flour + " cups of all purpose flour.");
  System.out.println(butter + " stick of unsalted butter.");
  System.out.println(sugar + " cups of granulated sugar.");
  System.out.println(vanilla + " teaspoon of pure vanilla extract.");
  System.out.println(baksoda + " teaspoon of baking soda.");                   
  System.out.println(brosugar + "cups packed light brown sugar.");
  System.out.println(eggs + " large eggs.");                   
  System.out.println(chips + " bag semisweet chocolate chips.");
  }
}
  