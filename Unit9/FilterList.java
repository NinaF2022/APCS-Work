import java.util.*;

public class FilterList
{
  public static ArrayList<Integer> filterList(ArrayList<Integer> scores)
  {
    ArrayList<Integer> result = new ArrayList<Integer> ();

    for (int score: scores)
    {
      if (score > 90)
        result.add(score);
    }
    return result;
  }
  public static void main (String [] args)
  {
    ArrayList<Integer> scores = new ArrayList<Integer>();
    scores.add(90);
    scores.add(50);
    scores.add(70);
    scores.add(100);

    ArrayList<Integer> List = filterList(scores);
    System.out.println(List);
  }
}
