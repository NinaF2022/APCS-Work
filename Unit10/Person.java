public class Person
{
  public Person(String n, int p)
  {
    name = n;
    numberOfPets = p;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfPets()
  {
    return numberOfPets;
  }

  private String name;
  private int numberOfPets;
}
