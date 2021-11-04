public class ScoreKeeper
{
  public ScoreKeeper()
  {
    score = 0;
    scoreNormal = 0;
    scoreBonus = 0;
  }

  public int total()
  {
    return score + scoreNormal*100 + scoreBonus*1000;
  }
  public void addScoreNormal()
  {
    scoreNormal += 1;
  }

  public void addScoreBonus()
  {
    scoreBonus += 1;
  }

  private int scoreNormal;
  private int scoreBonus;
  private int score;
}
