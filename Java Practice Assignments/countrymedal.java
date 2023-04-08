/* medal.java
 * Deep Patel
 * April 1st, 2019
 * Program which stores the medal count of 5 countries in the Olympics */

public class countrymedal {
  public static void main(String[] args) {
    
  int[][] counts = {{12,10,9}, {11,5,10}, {10,10,5}, {9,7,12}, {8,7,9}};
  
  System.out.print("Gold" + "\t" + "Silver" + "\t" + "Bronze");
  System.out.println();
 
  for(int i = 0; i < 5; i++) {
    for(int j = 0; j < 3; j++) {
      System.out.print(counts[i][j]);
      System.out.print("\t");
    }
    System.out.println();
  }
  
  int sum = 0;
 
  System.out.println();
    System.out.println("Sum of Medals Per Country:");
    int russia = counts[0][0] + counts[0][1] + counts[0][2];
    System.out.println("Russia: " + russia + " medals");
    int norway = counts[1][0] + counts[1][1] + counts[1][2];
    System.out.println("Norway: " + norway + " medals");
    int canada = counts[2][0] + counts[2][1] + counts[2][2];
    System.out.println("Canada: " + canada + " medals");
    int states = counts[3][0] + counts[3 ][1] + counts[3][2];
    System.out.println("United States: " + states + " medals");
    int nethers = counts[4][0] + counts[4][1] + counts[4][2];
    System.out.println("Netherlands: " + nethers + " medals");
    
  System.out.println();
    System.out.println("Sum of Medals of ALL Countries:");
    System.out.println(russia + norway + canada + states + nethers);
     
    
  }
}