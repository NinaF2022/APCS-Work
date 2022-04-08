import java.util.*;
public class ItemCalculatorTests
{
  public static boolean itemAverageTest()
  {
    ArrayList<Item> items = new ArrayList<Item>();
    Item item1 = new Item("Banana", 1);
    Item item2 = new Item("apple",2);
    Item item3 = new Item("car", 3);

    items.add(item1);
    items.add(item2);
    items.add(item3);

    ItemCalculator calculator = new ItemCalculator();
    float average = calculator.averagePrice(items);

    if(average == 2)
      return true;
    else
      return false;
  }

  public static boolean itemMostExpensiveTest()
  {
    ArrayList<Item> items = new ArrayList<Item>();
    Item item1 = new Item("Banana", 1);
    Item item2 = new Item("apple",3);
    Item item3 = new Item("car", 2);

    items.add(item1);
    items.add(item2);
    items.add(item3);

    ItemCalculator calculator = new ItemCalculator();
    float mostExpensive = calculator.mostExpensive(items);

    if(mostExpensive == 3)
      return true;
    else
      return false;
  }
  public static void main (String[] args)
  {
    if(itemAverageTest() == true)
      System.out.println("average test succeeded");
    else
      System.out.println("average test failed");
    if(itemMostExpensiveTest() == true)
      System.out.println("most expensive test succeeded");
    else
      System.out.println("most expensive test failed");
  }
}
