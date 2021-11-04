public class TestScoreKeeper
{
  public static void main(String[] args)
  {
    ScoreKeeper scorekeeper = new ScoreKeeper();

    scorekeeper.addScoreBonus();
    scorekeeper.addScoreNormal();
    scorekeeper.addScoreNormal();

    System.out.println("total: " + scorekeeper.total());
  }
}
