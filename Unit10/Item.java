public class Item
{
  public Item(String n, float p)
  {
    name = n;
    price = p;
  }

  public String getName()
  {
    return name;
  }

  public float getPrice()
  {
    return price;
  }

  private String name;
  private float price;
}
