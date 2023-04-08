/*AnimalSays.java
 * Deep, Brandon, Sukhjot
 * February 8th, 2019
 * Prints animal sounnds */

import java.util.Scanner;

public class animal {
  public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  
  System.out.println("What is your pet?:");
  String pet = in.next();
  
  System.out.println("What is your pet's name?:");
  String name = in.next();
  
  System.out.println("What sound does your animal make?:");
  String sound = in.next();
  
  System.out.println("Say hi to my " + pet + " " + name);
  System.out.println(name + " says:");
  System.out.println(sound + sound + sound);
  System.out.println(sound + sound);
  System.out.println(sound);
  }
}
    