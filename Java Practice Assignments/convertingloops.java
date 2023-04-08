/*convertloops.java
 * Deep Patel
 * March 21st, 2019
 * Program which took a for loop and converts it into a while loop */

public class convertingloops { 
  public static void main(String[] args) {
    
  int total = 0; //declaring the value of total as 0
  int count = 1; //declaring the value of count as 1
    
  while(count < 10) { //this loop repeats as long as count is less than 10
    count = count + 1; //each time the loop repeats, count is increased by 1
    total = total + count; //each time the loop repeats, the total is increased by the updated value of count
  }
  
  System.out.println("The total is: " + total); //user output for the final total
  }
}
//program complete
    