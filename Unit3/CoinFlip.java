public class CoinFlip
{
  public static String flip()
  {
    if(Math.random()<0.5)
      return "Heads";
    else
      return "Tails";
  }
  public static void main(String[]args)
  {
    for (int i=0; i<10; i++)
    {
      System.out.println(flip());
    }
  }
}
