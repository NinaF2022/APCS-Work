public class FizzBuzz
{
  public static void main(String[] args)
  {
    printSequence();
  }
  public static void printSequence()
  {
    for(int n=1; n<=30; n++)
    {
      if (n%3 ==0 & n%5 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else if (n%3 == 0)
      {
        System.out.println("Fizz");
      }
      else if (n%5 == 0)
      {
        System.out.println("Buzz");
      }
      else
        System.out.println(n);
    }
  }
}
