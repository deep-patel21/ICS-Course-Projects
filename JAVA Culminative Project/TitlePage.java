import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the title page of the project which includes the rules of the game and the start button also
 * Deep Patel
 * JUNE 2019
 * BlockGame.java */
public class TitlePage extends World
{

    /**
     * Constructor for objects of class TitlePage.
     * 
     */
    public TitlePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Start(), 300, 200); //adding the start button
        addObject(new rules(), 300, 350);// adding the rules image
        
}
}
