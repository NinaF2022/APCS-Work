public class Attention
{
  public static boolean attention(String sentence)
  {
    if(sentence.length()<7)
      return false;
    if (sentence.substring(0,7).equals("Hey you"))
      return true;
    else
      return false;
  }
  public static void testAttention(String sentence, boolean expected)
  {
    boolean result = attention(sentence);

    System.out.println("sentence " + sentence + ": expected " + expected);

    if(result = expected)
      System.out.println("works");
    else
      System.out.println("Nope");
  }
  public static void main(String[]args)
  {
    testAttention("Hey you there stop", true);
    testAttention("Yes I like pie", false);
    testAttention("Hey you go away", true);
    /*String s1 = "what's your favorite color?";
    System.out.println(s1 + ": " + attention(s1));
    String s2 = "what's your favorite animal";
    System.out.println(s2 + ": " + attention(s2));
    String s3 = "Hey you I like your hat";
    System.out.println(s3 + ": " + attention(s3));
    String s4 = "Hey";
    System.out.println(s4 + ": " + attention(s4)); */
  }
}
