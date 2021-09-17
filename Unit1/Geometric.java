public class Geometric
{
  public static void main(String[]args)
  {
    printSequence();
  }
  public static void printSequence()
  {
    int number = 3;
    for(int i=0; i<10; i++)
    {
      System.out.println(number);
      number *= 2;
    }
  }
}
