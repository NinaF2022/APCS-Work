public class PersonTest
{
  public static void main(String[] args)
  {
    Person ashley = new Person("Ashley", 1);
    Person emma = new Person("Emma", 3);
    Person drkessner = new Person("Dr. Kessner", 3);

    System.out.println(ashley.greeting());
    System.out.println(emma.greeting());
    System.out.println(drkessner.greeting());

    int sum = 0;
    sum += ashley.getNumberOfPets();
    sum += emma.getNumberOfPets();
    sum += drkessner.getNumberOfPets();
  }
}
