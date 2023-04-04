import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * This class is responsible for changing the images to have multiple pieces appear on the gameboard.
 * Deep Patel
 * JUNE 2019
 * BlockGame.java */
public class Piece extends Actor
{
    /**
     * Act - do whatever the Piece wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Random rand = new Random();
        // this sets the different images that I can reference later.
        GreenfootImage TetrisL = new GreenfootImage("tetrisL.png");
        GreenfootImage TetrisLine = new GreenfootImage("Tetris Line.png");
        GreenfootImage TetrisReverseL = new GreenfootImage("TetrisReverseL.png");
        GreenfootImage TetrisReverseS = new GreenfootImage("TetrisReverseS.png");
        GreenfootImage TetrisS = new GreenfootImage("Tetris_S.svg.png");
        GreenfootImage TetrisSquare = new GreenfootImage("Tetris_O.svg.png");
        GreenfootImage TetrisT = new GreenfootImage("TetrisT.png");
        
    
     int randomPiece = rand.nextInt(700); //this generates a random number
     

   {
    if(randomPiece >= 0 && randomPiece <= 100 ){ //setting up L Piece
           setImage(TetrisL);
           TetrisL.scale(150,90);
    } 
    
    if(randomPiece >= 101 && randomPiece <= 200 ){//setting up Line Piece
            setImage(TetrisLine);
            TetrisLine.scale(200,45);
    } 

    if(randomPiece >= 201 && randomPiece <= 300 ){ //setting up Reverse L Piece
            setImage(TetrisReverseL);
            TetrisReverseL.scale(150,90);
    } 
    
    if(randomPiece >= 301 && randomPiece <= 400 ){// setting Up Reverse S Piece
            setImage(TetrisReverseS);
            TetrisReverseS.scale(100,150);
    } 
    
    if(randomPiece >= 401 && randomPiece <= 500 ){ //setting up S Piece
            setImage(TetrisS);
            TetrisS.scale(150,90);
    } 
    
    if(randomPiece >= 501 && randomPiece <= 600 ){ //setting up Square Piece
            setImage(TetrisSquare);
            TetrisSquare.scale(90,90);
    } 
    
    if(randomPiece >= 601 && randomPiece <= 700 ){ //setting up T Piece
           setImage(TetrisT); 
           TetrisT.scale(150,90);
    }
}
    
    
   
    
    
    


    

}
}



