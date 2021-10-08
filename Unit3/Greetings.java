public class Greetings
{
  /*public static void greetings()
  {
    String name = "Ashley";
    System.out.println(name);
  }*/

  public static String greet(String name)
  {
    return "Hey, there, " + name + "!";
  }
  public static void main(String[]args)
  {
    //greetings();

    System.out.println(greet("Ashley"));
    System.out.println(greet("Dr. Kessner"));
  }
}
