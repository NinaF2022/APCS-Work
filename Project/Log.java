import  processing.core.*;

public class Log
{
  public Log(PApplet p)
  {
    this.p=p;
    //this.x = p.width;
    //this.y = p.random(p.height/2-50, p.height/2-150);
    this.vx = -5;
    setup();
  }

    public void setup()
    {
      photo = p.loadImage("Log2.png");

    }
    public void drawLog()
    {

      System.out.println("draw log");
      System.out.println(x + "x");
      System.out.println(y + "y");
      p.image(photo, x,y, 60, 60);
      x= x + vx;
    }

    public void setInitialPosition(float xPos, float yPos)
    {
      x = xPos;
      y = yPos;
    }

    public void setSpeed(float speed)
    {
      vx = speed;
    }

    public float getX()
    {
      return x;
    }

    public float getY()
    {
      return y + 10;
    }

    public float getWidth()
    {
      return 60;
    }

    public float getHeight()
    {
      return 60 - 20;
    }


    private PApplet p;
    private PImage photo;
    private float x;
    private float y;
    private float vx;
}
