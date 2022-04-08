import processing.core.*;
//import java.until.*;

public class TempleRun extends PApplet
{

  public void settings()
  {
    fullScreen();
  }

  public void setup()
  {
    gameState = 0;
    intro = new Intro(this);
    game = new Game(this);
  }

  public void draw()
  {
    background(28,138,42);
    if(gameState ==0)
      intro.drawIntro();
    else if(gameState == 1)
      game.drawGame();
    /*else if(gameState == 2)
      End();*/
  }

  public void keyPressed()
  {
    if (gameState == 0)
    {
      if(key == ' ')
        {
          gameState = 1;
        }
      else
        gameState = 0;
    }
    if (gameState == 1)
    {
      System.out.println("hello");
      game.keyPressed();
    }
  }
  /*public void keyReleased()
  {
    if (gameState == 1)
    {
      game.keyReleased();
    }
  }*/

  //Private ArrayList<Log> logs;
  private int gameState;
  private Intro intro;
  private Game game;

  public static void main(String[] args)
  {
    PApplet.main("TempleRun");
  }
}
