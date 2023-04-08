/* adventurestory.java
 * Deep Patel
 * February 27th, 2019
 * Game which utilized nested branches to generate different endings for the user playing*/

import java.util.Scanner; //imports the scanner function

public class adventurestory {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in); //allows the program to read inputs from the user
    
    System.out.println("ADVENTURE STORY by Deep!"); //program title
    System.out.println("Welcome to your personalized Adventure Story!"); //user output for welcome 
    System.out.println("In this story you will be provided with different scenarios. Choose the option you want to go with using the numbers 1 and 2, and watch the story progress!"); //user output for instructions
    System.out.println("Have Fun!"); //Yay!
    
    
    System.out.println("\nYou wake up on a Sunday morning and you want to do an exhilarating activity."); //story progression
    System.out.println("After looking on pinterest for the best weekend activites you find paintballing and bowling. Which one would you like to go to?"); //question for user
    System.out.println("\nOption 1: Go Paintballing     Option 2: Go Bowling"); //user input for options 1 and 2
    int paintbowl = in.nextInt();
    
    //paintball or bowling scenario 1
    if(paintbowl == 1) {
      System.out.println("You decide to go paintballing. After you enter the arena you realize you have never done anything like this before."); //story progression
      System.out.println("Do you want to stay in hiding to avoid being shot, or do you want to rush onto the battlefield?"); //question for user
      System.out.println("\nOption 1: Stay Hiding     Option 2: Rush into the Battlefield"); //user input for options 1 and 2
      int hiderush = in.nextInt();
      
      {
        if(hiderush == 1) { //hiding or rushing scenario 1
          System.out.println("You don't feel courageous, so you decide to stay in hiding to avoid being shot repeatedly."); //story progression
          System.out.println("\nAs you hide, you feel itchy on your face, but to scratch the itch you must remove your mask. What do you want to do?"); //question for user
          System.out.println("\nOption 1: Remove your mask to scratch the itch     Option 2: Deal with it an stay in your hiding spot on the far end of the map");  //user input for options 1 and 2
          int maskdeal = in.nextInt();
          
          if(maskdeal == 1) { //removing mask or dealing with the itch scenario 1
            System.out.println("When you remove your mask to scratch your itch, an enemy surprises you by sneaking into the back of your hiding space. He does not know your mask is off and ends up shooting your eye."); //story ending 1
          }
          
          else if(maskdeal == 2) { //removing mask or dealing with the itch scenario 2
            System.out.println("You keep your mask on to avoid being shot but you think about your itch too much you don't hear the closing bell. You are now locked at the paintball arena alone overnight."); //story ending 2
          }
        }
        
        if(hiderush == 2)  { //hiding or rushing scenario 2
          System.out.println("You feel brave and would like to rush into the field. When you get to the middle, you need to decide what action you would like to perform."); //story progression
          System.out.println("Do you want to capture the flag and be the hero of the game, or do you want to eliminate as many opponents as possible?"); //question for user
          System.out.println("\nOption 1: Capture the Flag     Option 2: Eliminate Opponents"); //user input for options 1 and 2
          int ctfelim = in.nextInt();
          
          if(ctfelim == 1) //capturing flag or eliminating enemies scenario 1
            System.out.println("You run into the battlefield to capture the flag, and dive in slow motion to get the victory for your team. You are the hero of the paintball match."); //story ending 3
          
          
          else if(ctfelim == 2) //capturing flag or eliminating enemies scenario 2
            System.out.println("You run into the battlefield to eliminate opponents but you end up getting shot so many times you break your arm."); //story ending 4
        }
      }}
    
    else if(paintbowl == 2) { //paintball or bowling scenario 2
      System.out.println("You decide to go bowling. There are two bowling places around your house and you need to pick one. Which one do you want to go to?"); //story progression
      System.out.println("\nOption 1: Bashing Bowlers     Option 2: Bowlerama"); //user input for options 1 and 2
      int bashbowl = in.nextInt();
      
      {
        if(bashbowl == 1) { //bashing bolwers or bowlerama scenario 1
          System.out.println("You pick Bashing Bowlers because it is closer to your house than Bowlerama. Since you don't own a car you will either need to walk or take the bus."); //story progression
          System.out.println("How do you want to get to the Bashing Bowlers bowling arena?"); //question for user
          System.out.println("\nOption 1: Take the bus     Option 2: Walk there"); //user input for options 1 and 2
          int buswalk = in.nextInt();
          
          if(buswalk == 1) { //taking the bus or walking scenario 1
            System.out.println("You don't feel like walking in the cold so you take the bus. 5 minutes into your ride, four shady men climb aboard the bus and strangle the bus driver."); //story ending 5
            System.out.println("Along with the other passengers you are now being held hostage and taken to an unknown place. You have no family so the criminals know they have no use for you."); //continued ending 5
            System.out.println("After confirming with their leader, the criminals decide to throw you over a bridge. Your next bus stop is at the bottom of Lake Ontario."); //continued ending 5
          }
          
          else if(buswalk == 2) { //taking the bus or walking scenario 2
            System.out.println("You only have enough money to pay for a bowling ticket and you can't afford the bus. You decide to walk to Bashing Bowlers."); //story ending 6
            System.out.println("On the way there you encounter a homeless man. Feeling sorry you decide to talk with him to make his day better."); //continued ending 6
            System.out.println("After having a conversation you turn to leave, but the man pushes you to the ground and steals your wallet. You just got mugged by a homeless man."); //continued ending 6
          }
        }
        
        if(bashbowl == 2) { //bashing bolwers or bowlerama scenario 2
          System.out.println("You pick Bowlerama because it has a higher rating on Google. Once you get there and sign up, you are offered Bowling lessons. Will you spend the extra money to learn from a professional or not?"); //story progression
          System.out.println("\nOption 1: Learn from a pro     Option 2: Just play around"); //user input for options 1 and 2
          int proplay = in.nextInt(); 
          
          
          if(proplay == 1) { //learning from pro or playing around scenario 1
            System.out.println("Using the skills you learn from the professional lessons, you go onto becoming the World Bowling Champion. Your story ends with fame and a huge wad of cash."); //story ending 7
          }
          if(proplay == 2) { //learning from pro or playing around scenario 2
            System.out.println("Since you don't go with the lessons, you fail to understand how to grip the ball. You lose handle and the bowling ball flies into the ceiling. You now owe bowlerama $12,950 for repairs."); //story ending 8
          }
        }}
    }
    else if(paintbowl != 1 || paintbowl != 2) {
      System.out.println("Invalid! Please use the numbers 1 and 2 to input an answer to progress your story.");
    }
  }
}
 //program complete
  













































