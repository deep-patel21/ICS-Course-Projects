import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the start button and when it is clicked, it changes the game background to the playing grid.
 * Deep Patel
 * JUNE 2019
 * BlockGame.java */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PlayGrid()); //this switches the background when the start button is cliked
    }
    }    
}
