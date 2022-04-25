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
    end = new End(this);
  }

  public void draw()
  {
    background(28,138,42);
    if(gameState ==0)
      intro.drawIntro();
    else if(gameState == 1)
      game.drawGame();
    else if(gameState == 2)
      end.drawEnd();
  }

  public void keyPressed()
  {
    if (gameState == 0)
    {
      if(key == ' ')
        {
          game.setup();
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
    if(gameState == 2)
    {
      if(key == ' ')
      {
        gameState = 0;
      }
    }
  }
  /*public void keyReleased()
  {
    if (gameState == 1)
    {
      game.keyReleased();
    }
  }*/

  public void setGameState(int gs)
  {
    gameState = gs;
  }

  //Private ArrayList<Log> logs;
  private int gameState;
  private Intro intro;
  private Game game;
  private End end;

  public static void main(String[] args)
  {
    PApplet.main("TempleRun");
  }
}
