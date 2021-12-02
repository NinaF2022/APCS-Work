public class CountLucky
{
  public static double countLucky (double[] numbers)
  {
    int count = 0;

    for (double number : numbers)
    {
      if (number%10 == 7)
      {
        System.out.println(number + " ends in 7");
        count++;
      }
      else if (number%7 ==0)
      {
        System.out.println(number + " multiple of 7");
        count++;
      }
      else
      {
        System.out.println(number + " doesn't end in 7");
      }
    }

    return count;
  }

  public static void main (String[] args)
  {
    double[] numbers = {7, 49, 10};

    double result = countLucky(numbers);
    System.out.println("result: " + result);


  }
}
