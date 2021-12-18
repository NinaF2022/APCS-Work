import java.util.*;

public class CountLucky
{
  public static int countLucky(ArrayList<Integer> numbers)
  {
    int count =0;
    for(int number: numbers)
    {
      if(number%7 ==0 || number%10 == 7)
      {
        count ++;
      }
    }
    return count;
  }

  public static void main (String [] args)
  {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(7);
    numbers.add(49);
    numbers.add(10);

    int result = countLucky(numbers);
    System.out.println("result: " + result);
  }
}
