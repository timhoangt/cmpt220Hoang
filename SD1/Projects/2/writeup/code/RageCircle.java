/**
*file: RageCircle.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Project 2
 * due date: May 8, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * RageCircle abstract data type.
 */
 
/**
 * RageCircle
 * 
 * This class creates a window for a game of rotating circles
 * and gates on those circles that the use must go through in order
 * to make it to the center goal and win the game.
 */

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class RageCircle extends PApplet{
  //Creates default values for speed, angles, position, and acceleration.
  public float speed = 3;   
  public float x = 300;
  public float y = 300;
  public boolean moveForward = false;
  public boolean moveLeft = false;
  public boolean moveRight = false;
  public boolean moveBack = false;
  public boolean moving = false;
  int num=20;
  float[]AngleX=new float[num];
  float[]AngleY=new float[num];
 
  //Creates window for the game and defaults size and position.
  public void setup(){
    size(800, 700);
    for(int i=0; i<num; i++){
      AngleX[i]=random(360);
      AngleY[i]=random(360);
    }
    smooth();
  }
    
  //Defaults colors and allows other classes to run.
  public void draw(){        
    background(0, 0, 255);
    drawCircle();
    move();
  }
     
  //Sets up and draw the circles.
  public void drawCircle(){
    background(255, 255, 255);
    translate(width/2,height/2);
    
    noFill();
    stroke(100,100);
    strokeWeight(2);
    ellipse(0,0,250,250);
          
    noFill();
    stroke(0,100);
    strokeWeight(2);
    ellipse(0,0,350,350);
            
    noFill();
    stroke(0,100);
    strokeWeight(2);
    ellipse(0,0,150,150);
            
    noFill();
    stroke(0,100);
    strokeWeight(2);
    ellipse(0,0,450,450);
            
    noFill();
    stroke(0,100);
    strokeWeight(2);
    ellipse(0,0,550,550);
            
    noFill();
    stroke(0,100);
    strokeWeight(2);
    ellipse(0,0,650,650);
            
    //Creates the end goal in the center.
    rect(-12,-12,24,24);
    stroke(250, 250,0);
    fill(250, 250,0);
    
    //Creates the user avatar (pixel in the bottom right).
    stroke(0, 149, 185);
    fill(0, 149, 185);
      
      
    //If you reach the goal, you have won.
    //The game displays a message and shuts down.
    if(dist(x, y, 0, 0) < 12){
      JOptionPane.showMessageDialog(frame,
      "Congratulations, you have won rage circle. You may want to calm down now.");
      System.exit(1);
    }
        
    //If you touch any of the circles, you have lost and the game shuts down.
    //However, if you touch a circle and a gate, you continue and the game still runs.
    if(abs(dist(x, y, 0, 0) - 325) < 2 ){
      if(-325 *  cos(-radians(frameCount )) > -325 *  cos(-radians(frameCount - 5))){
        if (x > (-325 *  cos(-radians(frameCount - 5))) && x < (-325 *  cos(-radians(frameCount)))){
        }
        else{
          System.exit(1);
        }
      }
        else{
          if(x > (-325 *  cos(-radians(frameCount ))) && x < (-325 *  cos(-radians(frameCount - 5)))){
          }
        else{
          System.exit(1);
        }
      }
    }
    if(abs(dist(x, y, 0, 0) - 225) < 2 ){
      if(-225 *  cos(3*-radians(frameCount)) > -225 *  cos(3*-radians(frameCount - 5))){
        if (x > (-225 *  cos(3*-radians(frameCount - 5))) && x < (-225 *  cos(3*-radians(frameCount)))){
        }
        else{
          System.exit(1);
        }
      }
      else{
        if(x > (-225 *  cos(3*-radians(frameCount ))) && x < (-225 *  cos(3*-radians(frameCount - 5)))){
        }
        else{
          System.exit(1);
        }
      }
    }
      
    if(abs(dist(x, y, 0, 0) - 125) < 2  ){
      if(-125 *  cos(5*-radians(frameCount)) > -125 *  cos(5*-radians(frameCount - 5))){
        if (x > (-125 *  cos(5*-radians(frameCount - 5))) && x < (-125 *  cos(5*-radians(frameCount)))){
        }
        else{
          System.exit(1);
        }
      }
      else{
        if(x > (-125 *  cos(5*-radians(frameCount ))) && x < (-125 *  cos(5*-radians(frameCount - 5)))){
        }
        else{
          System.exit(1);
        }
      }
    }
        
    if(abs(dist(x, y, 0, 0) - 175) < 2){
      if(-175 *  cos(4*-radians(frameCount)) > -175 *  cos(4*-radians(frameCount - 5))){
        if (x > (-175 *  cos(4*-radians(frameCount - 5))) && x < (-175 *  cos(4*-radians(frameCount)))){
        }
        else{
          System.exit(1);
        }
      }
      else{
        if(x > (-175 *  cos(4*-radians(frameCount ))) && x < (-175 *  cos(4*-radians(frameCount - 5)))){
        }
        else{
          System.exit(1);
        }
      }
    }
       
    if(abs(dist(x, y, 0, 0) - 275) < 2){
      if(-275 *  cos(2*-radians(frameCount)) > -275 *  cos(2*-radians(frameCount - 5))){
        if (x > (-275 *  cos(2*-radians(frameCount - 5))) && x < (-275 *  cos(2*-radians(frameCount)))){
        }
        else{
          System.exit(1);
        }
      }
      else{
        if(x > (-275 *  cos(6*-radians(frameCount ))) && x < (-275 *  cos(6*-radians(frameCount - 5)))){	
        }
        else{
          System.exit(1);
        }
      }
    }
        
    if(abs(dist(x, y, 0, 0) - 75) < 2){
      if(-75 *  cos(6*-radians(frameCount)) > -75 *  cos(6*-radians(frameCount - 5))){
        if (x > (-75 *  cos(6*-radians(frameCount - 5))) && x < (-75 *  cos(6*-radians(frameCount)))){
        }
        else{
          System.exit(1);
        }
      }
      else{
        if(x > (-75 *  cos(6*-radians(frameCount ))) && x < (-75 *  cos(6*-radians(frameCount - 5)))){
        }
        else{
          System.exit(1);
        }
      }
    }
         
    //Colors avatar again.  
    fill(255, 0, 0);
    rect(x, y, 3, 3);
        
    //Displays points that are used for gate; used for testing.
    /* fill(30, 100, 9);
       rect(-325 *cos(-radians(frameCount - 10)), 325* sin(-radians(frameCount - 10)), 10, 10);
       rect(-275 *  cos(2*-radians(frameCount-7)), 275* sin(2*-radians(frameCount-7)), 10, 10);
       rect(-225 *  cos(3*-radians(frameCount - 6)), 225* sin(3*-radians(frameCount - 6)), 10, 10);
       rect(-175 *  cos(4*-radians(frameCount - 5)), 175* sin(4*-radians(frameCount - 5)), 10, 10);
       rect(-125 *  cos(5*-radians(frameCount - 5)), 125* sin(5*-radians(frameCount - 5)), 10, 10);
       rect(-75 *  cos(6*-radians(frameCount - 5)), 75* sin(6*-radians(frameCount - 5)), 10, 10);
       rect(-325 *cos(-radians(frameCount)), 325* sin(-radians(frameCount)), 10, 10);
       rect(-275 *  cos(2*-radians(frameCount)), 275* sin(2*-radians(frameCount)), 10, 10);
       rect(-225 *  cos(3*-radians(frameCount)), 225* sin(3*-radians(frameCount)), 10, 10);
       rect(-175 *  cos(4*-radians(frameCount)), 175* sin(4*-radians(frameCount)), 10, 10);
       rect(-125 *  cos(5*-radians(frameCount)), 125* sin(5*-radians(frameCount)), 10, 10);
       rect(-75 *  cos(6*-radians(frameCount)), 75* sin(6*-radians(frameCount)), 10, 10);
       fill(255);
    */
        
    //Creates the gates on the circles that rotate.
    rotate(radians(frameCount));
    stroke(1000, 1000, 1000);
    fill(255);
    rect(-330, 0, 15, 60);
                
    rotate(radians(frameCount));
    stroke(1000, 1000, 1000);
    fill(255);
    rect(-280, 0, 15, 60);
        
    rotate(radians(frameCount));
    stroke(1000, 1000, 1000);
    fill(255);
    rect(-230, 0, 15, 60);
        
    rotate(radians(frameCount));
    stroke(1000, 1000, 1000);
    fill(255);
    rect(-180, 0, 15, 50);
        
    rotate(radians(frameCount));
    stroke(1000, 1000, 1000);
    fill(255);
    rect(-130, 0, 15, 50);
        
    rotate(radians(frameCount));
    stroke(1000, 1000, 1000);
    fill(255);
    rect(-80, 0, 15, 40);
  }
     
  //Allows for movement of the avatar when the associative key is pressed.
  public void keyPressed(){
    if(key == 'a'){
      moveLeft = true;
    }
    if(key == 'd'){
      moveRight = true;
    }
    if(key == 'w'){
      moveForward = true;
    } 
    if(key == 's'){
      moveBack = true;
    }
  }
  
  //Stops the movement of the avatar when the associative key is released.
  public void keyReleased(){
    if(key =='a'){
      moveLeft = false;
    }
    if(key == 'd'){
      moveRight = false;
    }
    if(key == 'w'){
      moveForward = false;
    } 
    if(key == 's'){
      moveBack = false;
    }
  }
    
  //If the avatar is moving, it moves in the direction wanted at the default speed.
  public void move(){
    if(moveForward){
      y -= speed;
    }
    if(moveLeft){
      x -= speed;
    }
    if(moveRight){
      x += speed;
    }
    if(moveBack){
      y += speed;
    }
  }
}