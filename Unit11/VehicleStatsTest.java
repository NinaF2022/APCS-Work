import java.util.*;
public class VehicleStatsTest
{
  public static boolean totalWheelsTest()
  {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Car());
    vehicles.add(new Motorcycle());
    vehicles.add(new Bicycle());
    vehicles.add(new Unicycle());

    VehicleStats stats = new VehicleStats();
    int totalWheels = stats.totalWheels(vehicles);

    if(totalWheels == 9)
      return true;
    else
      return false;
  }

  public static boolean areHumanPoweredTest()
  {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Car());
    vehicles.add(new Motorcycle());
    vehicles.add(new Bicycle());
    vehicles.add(new Unicycle());

    VehicleStats stats = new VehicleStats();
    ArrayList<Vehicle> humanPower = stats.areHumanPowered(vehicles);

    if(humanPower.size() == 2)
      return true;
    else
      return false;
  }

  public static void main (String [] args)
  {
    if(totalWheelsTest() == true)
      System.out.println("total wheels test succeed");
    else
      System.out.println("total wheels test failed");
    if(areHumanPoweredTest() == true)
      System.out.println("human powered test succeeded");
    else
      System.out.println("human powered test failed");
  }
}
