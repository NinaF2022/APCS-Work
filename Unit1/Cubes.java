public class Cubes
{
  public static void main(String[]args)
  {
    printSequence();
  }
  public static void printSequence()
  {
    for(int i=0; i<10; i++)
    {
      int cube = i * i * i;
      System.out.println(cube);
    }
  }
}
