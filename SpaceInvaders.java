/**
  *[ SpaceInvaders ]
  *COMP1020 SECTION[A02]
  *INSTRUCTOR:[ Olivier Tremblay-Savard ]
  *NAME:[ Abdullah Al Noman]
  *ASSIGNMENT:[Assignment 4]
  *QUESTION:[ All of the parts of the assignement is completed except the bonus part]
  **PURPOSE:[ This class controls the game state ]
  */

import java.util.ArrayList;
public class SpaceInvaders {
  private int height; //set the height of the canvas
  private int width; //set the width of the canvas 
  private int alienX; //x coordinates of alien
  private int alienY; //y coodrdinates of alien
  private int bulletX; //x coordinates of bullet 
  private int bulletY; //y coordinates of bullet
  private int space;  //space between each alien
  private int move;  //movement speed of object
  private boolean left, right; //boolean used to keep alien in the screen 
  private int bulletNum; //counts the number of bullet 
  private ArrayList<Sprite> item =new ArrayList<Sprite>(); //an arraylist that holds all the objects that is drawn in screen
  
  /**
 * Constructor
 */
  public SpaceInvaders(int height,int width) { 
    this.height=height;
    this.width=width;
    alienX=0;
    alienY=0;
    bulletX=0;
    bulletY=0;
    space=30;
    move=3;
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        item.add(new Alien(alienX+(j*space),alienY+(i*space)));
      }
    }
    item.add(new Ship(225,380));
  }
  
  /**
 * this method updates the movement of alien and bullet and also detects the collision between the bullet and alien
 */
  public void update(){
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Alien){
        if(item.get(i).getX()>(width-space/2)){
          left = true;
          right = false; 
          for(int j=0;j<item.size();j++){
            if(item.get(j) instanceof Alien){
              ((Alien)item.get(j)).direction(0,move);
            }
          }
        }else if(item.get(i).getX()<0){
          left = false;
          right = true;
          for(int j=0;j<item.size();j++){
            if(item.get(j) instanceof Alien){
              ((Alien)item.get(j)).direction(0,move);
            }
          }
        }
      }
    }
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Alien){
        if(left && !right){
          ((Alien)item.get(i)).direction(-move,0);
        }else{
          ((Alien)item.get(i)).direction(move,0);
        }
      }
    }
    
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Bullet){
        ((Bullet)item.get(i)).direction(0,-move);
        bulletY=item.get(i).getY();
        if(item.get(i).getY()<0){
          item.remove(item.get(i));
          bulletNum--;
        }
      }
    }
    
    if(bulletY>0){
      collison();
    }
    
  }
  /**
 * this is a helper method which checks the collison if a bullet touches the alien or not
 */
  private void collison(){
   
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Bullet){
        Bullet b=(Bullet)(item.get(i));
        for(int j=0;j<item.size();j++){
          if(item.get(j) instanceof Alien){
            if(Math.sqrt((item.get(j).getX()-b.getX())*(item.get(j).getX()-b.getX())+(item.get(j).getY()-b.getY())*(item.get(j).getY()-b.getY()))<space){
              item.remove(item.get(j));
              item.remove(b); 
              bulletNum--;
            }
          }   
        }
      }
    }
  }
 /**
 * returns the array list that holds all the objects 
 */
  public ArrayList<Sprite>getItems(){
      return item;
    }
  /**
 * this method detects the status of the game 
 */
  public int status(){
    int alienNum=0;
    int alienY=0;
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Alien){
        alienNum++;
        alienY=item.get(i).getY();
      }
    }
    if(alienNum==0)
      return Display.WIN;
    else if(alienY>380)
      return Display.LOSE;
    else
      return Display.CONTINUE;
  }
  /**
 * controls the movement of the ship 
 */
  public void move(int direction){
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Ship){
          if(direction==Display.MOVE_LEFT && item.get(i).getX()>=0){
            ((Ship)(item.get(i))).direction(-move,0);
          }
          else if(direction==Display.MOVE_RIGHT && item.get(i).getX()<=400){
            ((Ship)(item.get(i))).direction(move,0);
          }
      }
    }
  }
  /**
 * when this method is called bullet is being shot 
 */
  public void shoot(){
    for(int i=0;i<item.size();i++){
      if(item.get(i) instanceof Ship){
        bulletX=item.get(i).getX();
        bulletY=item.get(i).getY();
      }
    }
    if(bulletNum<2){
      item.add(new Bullet(bulletX,bulletY));
      bulletNum++;
    }
  }
}
