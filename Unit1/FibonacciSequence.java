public class FibonacciSequence
{
  public static void main(String [] args)
  {
    int combined;
    int previous = 1;
    int previousPrevious = 0;
    System.out.println(previous);
    for(int i=0; i<30; i++)
    {
      combined = previous + previousPrevious;
      System.out.println(combined);
      previousPrevious = previous;
      previous = combined;

    }
  }
}
