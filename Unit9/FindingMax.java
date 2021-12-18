public class FindingMax
{
  public static double findingMax(double[] values)
  {
    double max = values[0];

    for(double value : values)
    {
      if (value > max)
      {
        max = value;
      }
    }
    return max;
  }
  public static void main (String [] args)
  {
    double [] values = { 3.5, 4.2, 7.9};
    System.out.println("max value: " + findingMax(values));
  }
}
