/* twodimarray.java
 * Deep Patel
 * April 1st, 2019
 * Program which prints a two dimensional array of rows 2 and coloumns 4 */

public class twodimarray {
  public static void main(String[] args) {
  
  int[][] nums = {{1,2,3,4} , {5,6,7,8}}; //declaring the values inside my 2D Array
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
  for(int i = 1; i < 5; i++) { //this for statement prints up to the number 4, at place 3
    System.out.print(i); //print value of j
  }
  System.out.println(); //creating a new line between '1234' and '5678'
  for(int j = 5; j < 9; j++) { //this for statement
    System.out.print(j); //print value of i prints the numbers from 5 up to 8
 }  
}
}