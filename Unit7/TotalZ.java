public class TotalZ
{
  public static int totalZ(String [] letters)
  {
    int count = 0;

    for(String letter: letters)
    {
      if (letter.substring(0,1).equals("Z"))
      {
        System.out.println(letter);
        count += letter.length();
      }
      else if(letter.substring(0,1). equals("z"))
      {
        System.out.println(letter);
        count += letter.length();
       }
    }
    return count;
  }

  public static void main (String [] args)
  {
    String[] letters = {"Zelda", "groot", "zonks"};

    int result = totalZ(letters);
    System.out.println("result: " + result);
  }
}
