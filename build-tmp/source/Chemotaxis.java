import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here   
Bacteria [] colony;

 public void setup()   
 {     
 	size(400, 400);
 	//initialize bacteria variables here
 	colony = new Bacteria[150];   
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony[i] = new Bacteria();
 	}
 }   

 public void draw()   
 {    
 	//move and show the bacteria 
 	 background(0, 204, 204);
 	 for(int i = 0; i < colony.length; i++)
 	 {
 	 	colony[i].move();
 	 	colony[i].show(); 
 	 }
 }  

 class Bacteria    
 {     
 	//3 ints which hold the x and y coordinates of the bacteria postion, and the bacteria color
 	int myX, myY, myColor, myColor2, myColor3;
 	Bacteria() 
 	{
 		myX = 200;
 		myY = 200;
 		myColor = (int)(Math.random()*256);
 		myColor2 = (int)(Math.random()*255);
 		myColor3 = (int)(Math.random()*255);
 	}

 	public void move()
 	{
 		myX = myX + (int)(Math.random()*3)-1;
 		myY = myY + (int)(Math.random()*3)-1;
 	}

 	public void show() 
 	{
 		fill(myColor, myColor2, myColor3);
 		noStroke();
 		ellipse(myX, myY, 10, 10);
 	}
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
