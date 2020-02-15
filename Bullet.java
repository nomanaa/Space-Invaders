/**
  *[ Bullet ]
  *COMP1020 SECTION[A02]
  *INSTRUCTOR:[ Olivier Tremblay-Savard ]
  *NAME:[ Abdullah Al Noman]
  *ASSIGNMENT:[Assignment 4]
  *QUESTION:[  All of the parts of the assignement is completed except the bonus part]
  **PURPOSE:[ This class represent a bullet object ]
  */
import java.awt.Color;
public class Bullet extends Sprite {
  
 private int x; //x coordinates of bullet
 private int y; //y coordinates of bullet
 
  //2D color array which draws a bullet 
 public static final Color[][] BULLET_SHAPE={
   {null,null,null,null,null,Display.BLUE,null,null,null,null,null},{null,null,null,null,null,Display.BLUE,null,null,null,null,null}
 };
 /**
 * constructor to initiate the variables
 */
 public Bullet (int x,int y) { 
   this.x=x;
   this.y=y;
 }
 /**
 *this method returns the x coordinates of the bullet
 */
 public int getX(){
   return x;
 }
 /**
 * this method returns the y coordinates of the bullet
 */
 public int  getY(){
   return y;
 }
 /**
 *  this method controls the direction and movement of a bullet
 */
 public void direction(int moveX,int moveY){
   y+=moveY;
 }
 /**
 * this method returns the 2D pixel array  of bullet shape
 */
 public Color[][] getColorGrid(){
   return BULLET_SHAPE;
 }
}
