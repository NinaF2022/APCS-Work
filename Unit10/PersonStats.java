import java.util.*;

public class PersonStats
{
  public float averageNumberOfPets(ArrayList<Person> persons)
  {
    float total = 0;
    int count = 0;
    for(Person p: persons)
    {
      total += p.getNumberOfPets();
      count += 1;
    }
    return total/count;
  }
  public String mostPets(ArrayList<Person> persons)
  {
    Person mostPets = persons.get(0);
    for(Person p: persons)
    {
      if(p.getNumberOfPets() > mostPets.getNumberOfPets())
        mostPets = p;
    }
    return mostPets.getName();
  }
  public ArrayList<Person> atLeastTwoPets(ArrayList<Person> persons)
  {
    ArrayList<Person> atLeast2 = new ArrayList<Person>();
    for(Person p: persons)
    {
      if(p.getNumberOfPets() >= 2)
        atLeast2.add(p);
    }
    return atLeast2;
  }
}
