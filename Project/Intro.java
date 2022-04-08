import processing.core.*;

public class Intro
{
  public Intro(PApplet p)
  {
    this.p = p;
    this.c = p.color(p.random(255), p.random(255), p.random(255));
    this.s = "Use the UP and DOWN arrows to move your character!";
    setup();
  }

  public void setup()
  {
    photo = p.loadImage("Nina.jpg");
  }
  public void drawIntro()
  {
    p.image(photo, 0,0);
    p.fill(c);
    p.textSize(50);
    p.text("Welcome to Temple Run Nina", p.width*.45f, p.height*.45f);
    p.textSize(30);
    p.text(s, p.width*.45f, p.height*.60f);
    p.textSize(40);
    p.text("Press space to continue", p.width*.45f, p.height*.75f);
  }
  private PApplet p;
  private PImage photo;
  private int c;
  private String s;
}
