public class Animal
{
  public Animal (String n, int l, boolean f)
  {
    name = n;
    legCount = l;
    furriness = f;
  }

  public String getName()
  {
    return name;
  }

  public int getLegCount()
  {
    return legCount;
  }

  public boolean getFurriness()
  {
    return furriness;
  }

  private String name;
  private int legCount;
  private boolean furriness;
}
