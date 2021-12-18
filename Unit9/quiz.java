public class Quiz
{
  public static ArrayList<String> lastLetter(String[]words)
  {
    ArrayList<String> letter = new ArrayList<String>();

    for(String w: words)
    {
      letter.add(w.substring(w.substring.length-1));
    }
    return letter;
  }

  public static void main(String [] args)
  {
    String[] lastLetter = {"Cat", "dog"};
    System.out.println(lastLeter(words));
  }


}
