public class SumOfSquares
{
  public static double sumOfSquares(double[] values)
  {
    double total = 0.0;

    for (double i = 0; i<=values.length; i++)
    {
      total += i*i;
    }
    return total;
  }
  public static void main (String[] args)
  {
    double [] values = {1,2,3};

    double result = sumOfSquares(values);
    System.out.println("result: " + result);
  }
}
