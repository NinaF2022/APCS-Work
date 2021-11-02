public class Unit4
{
  // Mississippi
  public static int countIss(String s)
  {
      int count = 0;
      for (int i=0; i+3 <= s.length(); i++)
      {
      String sub = s.substring(i, i+3);
        if (sub.equals("iss"))
          count++;
      }

    return count;
  }
  public static int countNa(String f)
  {
      int count = 0;
      for (int i=0; i+2 <= f.length(); i++)
      {
      String sub = f.substring(i, i+2);
        if (sub.equals("na"))
          count++;
      }

    return count;
  }
  public static void main(String[]args)
  {
    String s = "Mississippi";
    String f = "Bananananana";
    System.out.println(s + ": " + countIss(s));
    System.out.println(f + ": " + countNa(f));
    System.out.println("sumOfSquares" + ": " + sumOfSquares(3));
    System.out.println("sumOfSquares" + ": " + sumOfSquares(2));
    System.out.println("reverse" + ": " + reverse("bad"));
    System.out.println("reverse" + ": " + reverse("bah bah black sheep"));
    System.out.println("reverse" + ": " + reverse("tacocat"));
    System.out.println("factorial" + ": " + factorial(5));
  }

  // sumOfSquares
  public static int sumOfSquares(int n)
  {
    int total = 0;

    for (int i=1; i<=n; i++)
      total += i*i;

    return total;
  }

  //Reverse
  public static String reverse(String word)
  {
    String thing = "";

    for(int i=word.length()-1; i>=0; i--)
    {
      thing += word.substring(i,i+1);
    }

    return thing;
  }

  public static int factorial(int a)
  {
    int all = 1;

    for (int i=1; i<=a; i++)
    {
      all *= i;
    }

    return all;
  }
}
