/* pizza.java
 * Deep Patel
 * April 2019
 * Program which calculates over eaten pizza by each student at different groups at a class party */

public class pizza {
  public static void main(String[] args){
  
int[][] counts = {{4,1,2,5}, {1,1,2,3}, {4,3,2,2}, {1,2,2,4}, {3,2,3,3}, {4,4,4,4}};

for(int j = 0; j <= 3; j++) { //for loop for finding the number of groups
  for(int i = 3; i >= 0; i--) //for loop for finding the number of students
    if(counts[j][i] >= 4) { //if slices is over 3
  System.out.println(counts[j][i] + " student[s] ate more than their share.");
  //prints the amount of students who overate at the class party
  }
}


}
}
//program complete
 
