/*convertloops.java
 * Deep Patel
 * March 21st, 2019
 * Program which took a for loop and converts it into a while loop */

public class convertloops { 
  public static void main(String[] args) {
    
  int total = 0; //declaring the value of total as 
  int count = 1;
    
  while(count < 10) {
    count = count + 1;
    total = total + count;
  }
  
  System.out.println("The total is: " + total);
  }
}
    