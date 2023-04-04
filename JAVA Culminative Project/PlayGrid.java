import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Creates a new world that appears in portrait mode
 * Deep Patel
 * JUNE 2019
 * BlockGame.java */
public class PlayGrid extends World
{


    public PlayGrid()
    {
       super(600, 600, 1);
      /* Creating a new world that appears in portrait mode to resemble the classic look
       of Tetris */
     
      

  
    
      
      addObject(new TheBlockspot(),300, 75); //this is the area in which the program shows the next piece that will appear.
     
      for(int i = 0; i < 35; i++) {
      addObject(new Piece (),500, 75); //this adds the randomly generated piece in the Piece actor class.
    }
      addObject(new winline(), 50, 185);
    
    }
     
      
     
     
      
      
 
      
      
       
     
  
    
    }
