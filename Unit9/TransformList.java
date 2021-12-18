public class TransformList
{
  public static String reverse(String s)
  {
      String thing = "";

      for(int i=s.length()-1; i>=0; i--)
      {
        thing += s.substring(i,i+1);
      }

      return thing;
  }

  public static String[] reverseAll(String[] values)
  {
    String [] reversed = new String [values.length] ;

    for(int i=0; i<values.length; i++)
    {
      reversed[i] = reverse(values[i]);
    }

    return reversed;
  }

  public static void main (String[] args)
  {
    String [] notReversed= {"cat", "dog", "abds"};
    String [] reversed = reverseAll(notReversed);
    for(String s : reversed)
      System.out.println(s);
  }
}
