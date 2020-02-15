/**
  *[ Ship ]
  *COMP1020 SECTION[A02]
  *INSTRUCTOR:[ Olivier Tremblay-Savard ]
  *NAME:[ Abdullah Al Noman]
  *ASSIGNMENT:[Assignment 4]
  *QUESTION:[ All of the parts of the assignement is completed except the bonus part]
  **PURPOSE:[This class represent a ship object]
  */
import java.awt.Color;
public class Ship extends Sprite {
  private int x; //x coordinates of ship
  private int y; //y coordinates of ship
   public static final Color [][] SHIP_SHAPE = 
   {
     {null,null,null,null,null,Display.BLACK,null,null,null,null,null},
     {null,null,null,null,Display.BLACK,Display.BLACK,Display.BLACK,null,null,null,null},
     {null,null,null,null,Display.BLACK,Display.BLACK,Display.BLACK,null,null,null,null},
     {null,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,null},
     {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
     {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
     {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
     {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
     {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
     {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
   };
   
   /**
 * constructor to initiate the variables
 */
  public Ship(int x,int y) { 
     this.x=x;
     this.y=y;
  }
  /**
 * this method returns the x coordinates of the ship
 */
  public int getX(){
    return x;
  }
  /**
 * this method returns the y coordinates of the ship
 */
  public int  getY(){
    return y;
  }
  /**
 * this method controls the direction and movement of a ship
 */
  public void direction(int moveX,int moveY){
     x+=moveX;
  }
  /**
 * this method returns the 2D pixel array  of ship shape
 */
  public Color[][] getColorGrid(){
    return SHIP_SHAPE;
  }
}
