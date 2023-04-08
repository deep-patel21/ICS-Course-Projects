/* StarChart.java
 * Deep Patel
 * April 2019
 * Program which tracks student star numbers on a poster */

public class StarChart {
  public static void main(String[] args) {
    String[] students = {"Evan", "Ady", "Max", "Theo"}; //declaring array of student names
    int[] stars = {3,5,2,5}; //declaring array of current student star numbers
    stars = addSticker(students, stars, "Ady"); // calling on method addSticker to add a sticker to Ady
    stars = removeSticker(students, stars, "Max"); //calling on method removeSticker to remove a sticker from Max
    displayPoster(students, stars); //calling on method displayPoster to display the poster of stars
  }
}

public static int[] addSticker(String[] students, int[] stars) {
  stars[1] = star[1] + 1; //adding a star to whatever value is at the index for Ady
  
  return stars; //return of stars back to main
}

public static int[] removeSticker(String[] students, int[] stars) {
  stars[2] = stars[2] - 1; //subtracting a star from whatever value is at the index for Max
  
  return stars; //return of stars back to main
}

public static void displayPoster(String[] students,int[] stars) {
  System.out.println(students[0] + stars[0]); //printing all the students with their star numbers
  System.out.println(students[1] + stars[1]);// " "
  System.out.println(students[2] + stars[2]);// " "
  System.out.println(students[3] + stars[3]);// " "
  
  return students;
  return stars;
}
}
//program completed

  
  
  