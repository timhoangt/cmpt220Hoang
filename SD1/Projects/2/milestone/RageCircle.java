import javax.swing.JOptionPane;

import processing.core.PApplet;

public class RageCircle extends PApplet{
 
  //Creates window for the game.
  public void setup(){
    size(800, 700);
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
  }
}