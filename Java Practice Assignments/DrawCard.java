/* drawcard.java
 * Deep Patel
 * April 2019
 * Program that randomly generates a suit and value of a card */

import java.util.Random;

public class DrawCard{
  public static void main(String[] args){
    for (int i = 0;i < 52; i++){
      drawCard();
    }
  }
  public static void drawCard() {
    
    Random rand = new Random();
    
    System.out.print(rand.nextInt(13)+1 + " ");
    
    String[] suits = {"Spade", "Diamond", "Hearts", "Clubs"};
    int suitNum = rand.nextInt(4);
    
    System.out.println(suits[suitNum]);  
  }
}
//program complete


