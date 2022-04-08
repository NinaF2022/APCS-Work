import  processing.core.*;

public class Log
{
  public Log(PApplet p)
  {
    this.p=p;
    this.x = p.width;
    this.y = p.height/2-50;
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



    private PApplet p;
    private PImage photo;
    private float x;
    private float y;
    private float vx;
}
