/**
  *[ Sprite ]
  *COMP1020 SECTION[A02]
  *INSTRUCTOR:[ Olivier Tremblay-Savard ]
  *NAME:[ Abdullah Al Noman]
  *ASSIGNMENT:[Assignment 4]
  *QUESTION:[ All of the parts of the assignement is completed except the bonus part]
  **PURPOSE:[ This is an abstract class which has dummy methods]
  */
import java.awt.Color;

public abstract class Sprite {
  /**
 * A dummy method that returns the x coordinates of an object 
 */
  public int getX(){
    return 0;
  }
  /**
 * A dummy method that returns the y coordinates of an object
 */
  public int getY(){
    return 0;
  }
  /**
 * A dummy method that returns the 2D pixel array of specific shape
 */
  public Color [][] getColorGrid(){
    return null;
  }
}
