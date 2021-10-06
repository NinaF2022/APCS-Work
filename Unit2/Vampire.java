public class Vampire
{
  public static boolean isVampire(float hour, boolean awake)
  {
    if(hour>=6 && hour<22 && awake == false)
      return true;
    else if(hour<=6 || hour>=22 && awake == true)
      return true;
    else
      return false;
  }
  public static void testIsVampire(float hour, boolean awake, boolean expected)
  {
    boolean result = isVampire(hour, awake);

    System.out.println("hour: " + hour + "awake: " + awake + "expected: " + expected + "result: " + result + " ");

    if (result == expected)
    {
      System.out.println("passed the test!");
    }
    else
    {
      System.out.println("failer!");
    }
  }

  public static void main(String[]args)
  {
    testIsVampire(6, false, true);
    testIsVampire(22, false, false);
    testIsVampire(5, true, true);
  }
}
