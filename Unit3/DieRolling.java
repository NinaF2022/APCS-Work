public class DieRolling
{
  public static int roll()
  {
    return (int) (Math.random()*6 +1);

  }
  public static void main(String[] args)
  {
    for(int i=0; i<10; i++)
    {
      System.out.println(roll());
    }
  }
}
