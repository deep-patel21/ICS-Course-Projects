/* IntroToMethods.java
 * Deep Patel
 * April 9th, 2019
 * Program to introduce methods in java programming */

import java.util.Scanner;

public class IntroToMethods {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("What program would you like to use?:");
    System.out.println("1: largerInteger    2: largestDecimal    3: betweenIntegers");
    int options = in.nextInt();
    
    if( options == 1) {
      largerInteger();
    }
     
    if(options == 2) {
      smallestDecimal(); 
    }
    
    if(options == 3) {
      betweenIntgers();
    }
   
    System.out.println("Enter Integer One: "); //user input for int 1
    int num1 = in.nextInt(); 
    System.out.println("Enter Integer Two: "); //user input for int 2
    int num2 = in.nextInt(); 
    System.out.println("I can find the larger integer from your inputs!"); //progress
    largerInteger(num1,num2); //calling on method that displays larger number
    System.out.println("The program has finished its job!"); //program complete action1
    }
    System.out.println();
    
    System.out.println("Enter Decimal One: "); //user input for dec 1
    Double dec1 = in.nextDouble();
    System.out.println("Enter Decimal Two: "); //user input for dec 2
    Double dec2 = in.nextDouble();
    System.out.println("Enter Decimal Three: "); //user input for dec 3
    Double dec3 = in.nextDouble();
    System.out.println("I can find the largest decimal from your inputs!"); //progress
    smallestDecimal(dec1,dec2,dec3); //calling on method that displays largest decimal
    System.out.println("The program has finished its job!"); //program complete action2 
    
    System.out.println();
    
    System.out.println("Enter your startpoint integer: ");
    int integer1 = in.nextInt();
    System.out.println("Enter your endpoint integer: ");
    int integer2 = in.nextInt(); 
    System.out.println("I can print all the numbers between your inputs!");
    betweenIntegers(integer1,integer2); 
    System.out.println("The program has finished its job!"); }
  
  
  public static void largerInteger(int num1, int num2) { //calling on method largerInteger
    if(num1 > num2) { //comparing num1 to num2
      System.out.println("The larger integer is " + num1 + "."); //user output for the larger integer in case 1
    
    if(num1 < num2) { //vice-versa of above 
      System.out.println("The larger integer is " + num2 + "."); //user output for the larger integer in case 2
    }
  }
  
  public static void smallestDecimal(Double dec1, Double dec2, Double dec3) { //calling on method largestDecimal
    if(dec1 > dec2 && dec1 > dec3) { //comparing dec1 to dec2 and dec3
      System.out.println("The largest decimal is " + dec1 + "."); //user output for the largest decimal in case 1
    }
    if(dec2 > dec1 && dec2 > dec3) { //comparing " " " " 
      System.out.println("The largest decimal is " + dec2 + "."); //user output for the largest decimal in case 2
    }
    if(dec3 > dec2 && dec3 > dec1) { //comparing " " " " 
      System.out.println("The largest decimal is " + dec3 + "."); } //user output for the largest decimal in case 3
  }
  
  public static void betweenIntegers(int integer1,int integer2) {
    for(int j = integer1; j <= integer2; j++) {
      System.out.print(j + " ");
    }
  }
  
}
//program complete