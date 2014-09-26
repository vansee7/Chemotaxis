 //declare bacteria variables here   
Bacteria [] colony;

 void setup()   
 {     
 	size(400, 400);
 	//initialize bacteria variables here
 	colony = new Bacteria[350];   
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony[i] = new Bacteria();
 	}
 }   

 void draw()   
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

 	void move()
 	{
 		if (mouseX < myX)
 		{
 			myX = myX - (int)(Math.random()*2)-1;
 		}
 		if(mouseX > myX)
 		{
 			myX = myX + (int)(Math.random()*2)+1;
 		}
 		if(mouseY < myY)
 		{
 			myY = myY - (int)(Math.random()*2)-1;
 		}
 		if(mouseY > myY)
 		{
 			myY = myY + (int)(Math.random()*2)+1;
 		}
 	}

 	void show() 
 	{
 		fill(myColor, myColor2, myColor3);
 		noStroke();
 		ellipse(myX, myY, 10, 10);
 	}
 }
