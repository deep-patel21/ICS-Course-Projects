/* rotate.java
 * Deep Patel
 * April 2019
 * Program which rotates an integer array by one place */

public class rotate {
  public static void main(String[] args) {
  
  
int[] myArray = {5, 2, 7, 8, 9, 11}; //array start

for(int i = 0; i < 6; i++){ //declaring how many times to perform the move
  myArray[0] = myArray[1]; //swapping the place by one
}

for(int j = 0; j < myArray.length; j++);
  System.out.println(myArray); //printing new array
  }
}
//program completed
  

