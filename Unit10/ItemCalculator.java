import java.util.*;

public class ItemCalculator
{
  public void namePrice(ArrayList<Item> items)
  {
    for(Item i: items)
      System.out.println(i.getName() + ": " + i.getPrice());
  }

  public float averagePrice(ArrayList<Item> items)
  {
    float totalPrice = 0;
    int count = 0;
    for(Item i: items)
    {
      totalPrice = totalPrice + i.getPrice();
      count += 1;
    }

    return totalPrice/count; //check if .getCount is right or not
  }

  public float mostExpensive(ArrayList<Item> items)
  {
    float mostExpensive = 0;

    for (Item i  : items)
    {
      if(i.getPrice()>mostExpensive)
        mostExpensive = i.getPrice();
    }

    return mostExpensive;
  }
}
