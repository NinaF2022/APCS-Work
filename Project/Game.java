import processing.core.*;
//import java.until.*;

public class Game
{
  public Game(PApplet p)
  {
    this.p = p;
    setup();
  }

  public void setup()
  {
    player = new Player(p);
    log = new Log(p);
  }

  public void drawGame()
  {
    p.background(0);

    p.fill(217, 199, 121);
    p.rect(0, p.height/2, p.width, p.height);

    player.drawPlayer();
    log.drawLog();
  }

  public void keyPressed()
  {
    System.out.println("hi");
    player.keyPressed();
  }

  /*public void keyReleased()
  {
    player.keyReleased();
  } */
  private PApplet p;
  private Player player;
  private Log log;
}
