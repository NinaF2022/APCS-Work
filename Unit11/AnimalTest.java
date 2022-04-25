import java.util.*;
public class AnimalTest
{
  public static void main (String [] args)
  {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Huma());
    animals.add(new Cat());
    animals.add(new Centipede());
    animals.add(new Sponge());

    for(Animal a: animals)
    {
      System.out.println(a.getName() + " : " + a.getLegCount() + " : " + a.getFurriness());
    }
  }
}
