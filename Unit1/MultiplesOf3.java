public class MultiplesOf3
{
  public static void main(String[] args)
  {
    System.out.println("Fingers crossed");
    printSequence();
  }
  public static void printSequence()
  {
    int number = 3;

    for (int i=0; i<10; i++)
    {
      System.out.println(number);
      number += 3;
      }
    }
  }
