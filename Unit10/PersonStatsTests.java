import java.util.*;

public class PersonStatsTests
{
  public static boolean averageNumberOfPetsTest()
  {
    ArrayList<Person> persons = new ArrayList<Person>();
    Person person1 = new Person("David", 2);
    Person person2 = new Person("Penny", 3);
    Person person3 = new Person("Felix", 0);
    Person person4 = new Person("Amy", 3);

    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4);

    PersonStats calculator = new PersonStats();
    float average = calculator.averageNumberOfPets(persons);

    if(average == 2)
      return true;
    else
      return false;
  }

  public static boolean mostPetsTest()
  {
    ArrayList<Person> persons = new ArrayList<Person>();
    Person person1 = new Person("David", 2);
    Person person2 = new Person("Penny", 4);
    Person person3 = new Person("Felix", 0);
    Person person4 = new Person("Amy", 3);

    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4);

    PersonStats calculator = new PersonStats();
    String mostPets = calculator.mostPets(persons);

    if(mostPets == "Penny")
      return true;
    else
      return false;
  }

  public static boolean atLeastTwoPetsTest()
  {
    ArrayList<Person> persons = new ArrayList<Person>();
    Person person1 = new Person("David", 2);
    Person person2 = new Person("Penny", 4);
    Person person3 = new Person("Felix", 0);
    Person person4 = new Person("Amy", 1);

    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4);

    PersonStats calculator = new PersonStats();
    ArrayList<Person> atLeast2 = calculator.atLeastTwoPets(persons);

    if(atleast2.length() != 2) //check
      return false;
    if(atLeast2.get(0) != "David")
      return false;
    if(atLeast2.get(1) != "Penny")
      return false;
    return true;
  }

  public static void main (String [] args)
  {
    if(averageNumberOfPetsTest() == true)
      System.out.println("average number of pets test suceeded");
    else
      System.out.println("averae number of pets test failed");
    if(mostPetsTest() == true)
      System.out.println("most Pets test suceeded");
    else
      System.out.println("most pets test failed");
  }
}
