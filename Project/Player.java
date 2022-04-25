import processing.core.*;

public class Player
{
  public Player(PApplet p)
  {
    this.p =p;
    this.maxY = p.height/2-60;
    this.y = maxY;
    this.vy = 0;

    setup();
  }

  public void setup()
  {
    photo = p.loadImage("Player.png");

  }

  public void drawPlayer()
  {
    p.image(photo, x,y, 55,55);

    y = y + vy;
    if(y > maxY)
      y = maxY;

    if(y < p.height/2-150)
    {
      vy = vy *-3;
    }
    else if (y > p.height/2-49)
    {
      vy = 0;
    }
  }

  public boolean checkCollision(Log p)
  {
    // Player corners within log
    // upper left corner
    if(x > p.getX() && x < p.getX() + p.getWidth())
      if(y > p.getY() && y < p.getY() + p.getHeight())
        return true;
    // upper right corner
    if(x + 55 > p.getX() && x + 55 < p.getX() + p.getWidth())
      if(y > p.getY() && y < p.getY() + p.getHeight())
        return true;
    // lower left corner
    if(x > p.getX() && x < p.getX() + p.getWidth())
      if(y + 55 > p.getY() && y + 55 < p.getY() + p.getHeight())
        return true;
    // lower right corner
   if(x + 55 > p.getX() && x + 55 < p.getX() + p.getWidth())
    if(y + 55 > p.getY() && y + 55 < p.getY() + p.getHeight())
      return true;

   // Log corners within player
   // uppper left
   if(p.getX() > x && p.getX() < x + 55)
    if(p.getY() > y && p.getY() < y + 55)
      return true;
  // upper right
  if(p.getX() + p.getWidth() > x && p.getX() + p.getWidth() < x + 55)
    if(p.getY() > y && p.getY() < y + 55)
      return true;
  // lower left
  if(p.getX() > x && p.getX() < x + 55)
    if(p.getY() + p.getHeight() > y && p.getY() + p.getHeight() < y + 55)
      return true;
  // lower right
  if(p.getX() + p.getWidth() > x && p.getX() + p.getWidth() < x + 55)
    if(p.getY() + p.getHeight() > y && p.getY() + p.getHeight() < y + 55)
      return true;

    return false;
  }

  public void keyPressed()
  {
      System.out.println("helo");

      if(p.keyCode == p.UP)
      {
        System.out.println("bye");
        vy = -3;
      }
      else if(p.keyCode == p.DOWN)
      {
        System.out.println("yo");
        vy = 3;
     }
   }

  public void keyReleased()
  {
    if(p.key == p.CODED)
    {
      if(p.keyCode == p.UP || p.keyCode == p.DOWN)
      {
        vy =0;
      }
    }
  }
  private PApplet p;
  private float y;
  private float maxY;
  private float x = 200;
  private float vy;
  private PImage photo;
}
