import processing.core.*;

public class Player
{
  public Player(PApplet p)
  {
    this.p =p;
    this.y = p.height/2-40;
    this.vy = 0;
  }

  public void drawPlayer()
  {
    p.rect(200,y, 40,40);
    y = y + vy;

    if(y < p.height/2-150)
    {
      vy = vy *-3;
    }
    else if (y > p.height/2-40)
    {
      vy = 0;
    }
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
  private float vy;
}
