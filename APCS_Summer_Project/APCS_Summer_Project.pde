int state = 1;
int Ex = 100;
int Ey = 300;

Obstacle O;
Obstacle O2;
Obstacle O3;
Obstacle O4;
Obstacle O5;
Obstacle O6;

 void setup()
 {
   size(400,400);
   
   O = new Obstacle(400,300,50,100);
   O2 = new Obstacle(600,0,50,200);
   O3 = new Obstacle(800,200,50,200);
   O4 = new Obstacle(1000,0,50,150);
   O5 = new Obstacle(1200,250,50,150);
   O6 = new Obstacle(1400,0,50,150);  
 }
 
 void draw()
 {
   background(0);
  
   if (state == 1)
   {
     drawStart();
   }
   else if (state == 2)
   {
     drawGame();
   }
   else if (state == 3)
   {
     drawEnd();
   }
   
 }
 void drawStart()
 {
   text("Welcome, click any arrow key to begin!", 100, 200);
 }
 
 void drawGame()
 {
   background(#8054E8);
   
   drawCharacter();
   
    O.display();
    O2.display();
    O3.display();
    O4.display();
    O5.display();
    O6.display();
 }
 
 void drawEnd()
 {
   fill(255);
   text("game Over", 200, 200);
 }
 
 void keyPressed()
 {
   if (state ==1)
   {
     state = 2;
   }
   else if (keyCode == UP)
   {
     Ey -= 10;
   }
   else if (keyCode == DOWN)
   {
     Ey += 10;
   }
 }
 
 void drawCharacter()
 {   
   fill(0);
   ellipse(Ex,Ey,50,50);
 }
 
 class Obstacle
 {
   int x;
   int y;
   int w;
   int h;
   
   Obstacle (int xIn, int yIn, int wIn, int hIn)
   {
     x = xIn;
     y = yIn;
     w = wIn;
     h = hIn;
   }
   void display()
   {
     if(isInside(Ex + 25, Ey - 25)|| isInside(Ex - 25, Ey + 25))
     {
       state = 3;
     }
     fill(0);
     rect(x,y,w,h);

     x -= 2;
   
     if(x + 50 < 0)
     {
       x = 1000;
     }

   }
        
     boolean isInside(int a, int b)
     {
       if (x<a && a<x+w && y<b && b<y+h)
       {
         return true;
       }
       else
       {
         return false;
       }
    }
 }
