public class Fibonacci
{
  public static int[] fibonacci(int n)
  {
    int [] number = new int [n];
    number[0] = 1;

    int combined;
    int previous = 1;
    int previousPrevious=0;

    for(int i=1; i<n; i++)
    {
      combined = previous + previousPrevious;
      previousPrevious = previous;
      previous = combined;
      number[i] = combined;
    }
    return number;
  }

  public static void main (String[] args)
  {
    int[] number = fibonacci(7);
    for(int n : number )
      System.out.println(n);
  }
}
