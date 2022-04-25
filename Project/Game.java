import processing.core.*;
import java.util.*;

public class Game
{
  public Game(TempleRun p)
  {
    this.p = p;
    setup();
  }

  public void setup()
  {
    currentLevel = 1;
    player = new Player(p);
    logs = new ArrayList<Log>();
    addLogs();
    //logs.add(new Log(p));
    //logs.add(new Log(p));
  }

  public void drawGame()
  {
    p.background(0);

    p.fill(217, 199, 121);
    p.rect(0, p.height/2, p.width, p.height);

    player.drawPlayer();
    ArrayList<Log> toRemove = new ArrayList<Log>();
    for(Log l : logs)
    {
      l.drawLog();
      if(player.checkCollision(l))
        p.setGameState(2);

      if(l.getX() + l.getWidth() < 0)
        toRemove.add(l);
    }

    for(Log remove : toRemove)
      logs.remove(remove);

    if(logs.isEmpty())
    {
      currentLevel++;
      addLogs();
      //logs.add(new Log(p));
    }// check if logs ie empty, then go to next level
  }

  private void addLogs()
  {
    float speed = -5 - currentLevel * 0.8f;
    float startX = p.width;
    float highOrLow = p.random(100);
    float startY = p.height/2 - 50;
    if(highOrLow > 50)
      startY -= 75;
    for(int i= 0; i<currentLevel; i++)
    {
      Log l = new Log(p);
      l.setInitialPosition(startX, startY);
      l.setSpeed(speed);
      logs.add(l);
      startX = startX + 300 + p.random(100);
      highOrLow = p.random(100);
      startY = p.height/2 - 50;
      if(highOrLow > 50)
        startY -= 75;
    }
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
  private TempleRun p;
  private Player player;
  private ArrayList<Log> logs;
  private int currentLevel = 1;
}
