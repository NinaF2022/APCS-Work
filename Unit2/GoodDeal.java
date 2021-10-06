public class GoodDeal
{
  public static boolean goodDeal(double originalPrice, double salePrice)
  {
    if(salePrice <= 0.75*originalPrice)
      return true;
    else
      return false;
  }

  public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
  {
    boolean result = goodDeal(originalPrice, salePrice);

    System.out.println("originalPrice: " + originalPrice + "salePrice: " + salePrice + "expected: " + expected);

    if(result == expected)
    {
      System.out.println("You passed the test");
    }
    else
    {
      System.out.println("You have failed :(");
    }
  }
  public static void main(String[]args)
  {
    testGoodDeal(75,70, false);
    testGoodDeal(40,15,true);
    testGoodDeal(100,20,true);
  }
}
