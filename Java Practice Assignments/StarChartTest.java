/* questionone.java
 * Deep Patel
 * April 2019
 * Program that teachers use to track student progress*/

public class StarChartTest {
  public static void main(String[] args) {
    
    String[] students = {"Evan", "Ady", "Max", "Theo"}; //declaring array of student names
    int[] stars = {3,5,2,5}; //declaring array of current student star numbers
    stars = addSticker(students, stars, "Ady"); // calling on method addSticker to add a sticker to Ady
    stars = removeSticker(students, stars, "Max"); //calling on method removeSticker to remove a sticker from Max
    displayPoster(students, stars); //calling on method displayPoster to display the poster of stars
  }

  
  public static int[] addSticker(String[] students,  stars) {
    stars[1] = star[1] + 1;
    
    return stars; 
  }
  
  
  public static int[] removeSticker(String[] students,  stars) {
    stars[2] = stars[2] - 1;
    
    return stars;
  }
  
  public static void displayPoster(String[] students,  stars);
  System.out.println(students[0] + stars[0]);
  System.out.println(students[1] + stars[1]);
  System.out.println(students[2] + stars[2]);
  System.out.println(students[3] + stars[3]);
  }


  
  
  