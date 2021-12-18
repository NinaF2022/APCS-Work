import java.util.*;

public class SumOfSquares
{
  public static double sumOfSquares(ArrayList<Double> values)
  {
    double total = 0.0;
    for(double value:values)
    {
        total += value*value;
    }
    return total;
  }

  public static void main (String[] args)
  {
    ArrayList<Double> values = new ArrayList<Double> ();
    values.add(1.0);
    values.add(2.0);
    values.add(3.0);

    double result = sumOfSquares(values);
    System.out.println("result: " + result);
  }
}
