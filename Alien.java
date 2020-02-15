import java.awt.Color;
public class Alien extends Sprite {
  
  private int x; //x coordinates of alien
  private int y; //y coordinates of alien
  
  //2D color array which draws an alien
  public static final Color [][] ALIEN_SHAPE = 
  {
    {null, null, Display.BLACK, null, null, null, null, null, Display.BLACK, null, null},
    {null, null, null, Display.BLACK, null, null, null, Display.BLACK, null, null, null},
    {null,null,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,null,null},
    {null,Display.BLACK,Display.BLACK,null,Display.BLACK,Display.BLACK,Display.BLACK,null,Display.BLACK,Display.BLACK,null},
    {Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK},
    {Display.BLACK,null,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,Display.BLACK,null,Display.BLACK},
    {Display.BLACK,null,Display.BLACK,null,null,null,null,null,Display.BLACK,null,Display.BLACK},
    {null,null,null,Display.BLACK,Display.BLACK,null,Display.BLACK,Display.BLACK,null,null,null}
    
  };
  
  /**
 * constructor to initiate the variables 
 */
  public Alien(int x,int y) { 
    this.x=x;
    this.y=y;
  }
  /**
 * this method returns the x coordinates of the alien 
 */
  public int getX(){
    return x;
  }
  /**
 * this method returns the y coordinates of the alien
 */
  public int  getY(){
    return y;
  }
  /**
 * this method controls the direction and movement of alien
 */
  public void direction(int moveX,int moveY){
    x+=moveX;
    y+=moveY;
  }
  
  /**
 * this method returns the 2D pixel array  of alien shape
 */
  public Color[][] getColorGrid(){
    return ALIEN_SHAPE;
  }
  
}
