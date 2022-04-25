import processing.core.*;

public class End
{
  public End(PApplet p)
  {
    this.p = p;
    this.c = p.color(p.random(255), p.random(255), p.random(255));
    //setup();
  }

  /*public void setup()
  {
    photo = p.loadImage("Nina.jpg");
  }*/
  public void drawEnd()
  {
    p.fill(c);
    p.textSize(50);
    p.text("Game Over!", p.width/2-200, p.height/2);
    p.text("Press Space to Restart!", p.width/2-200, p.height/2+100);
  }

  private PApplet p;
  private int c;
}
