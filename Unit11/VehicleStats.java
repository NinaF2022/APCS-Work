import java.util.*;

public class VehicleStats
{
  public int totalWheels(ArrayList<Vehicle> vehicles)
  {
    int total = 0;
    for(Vehicle v: vehicles)
    {
      total = total + v.wheelCount();
    }
    return total;
  }
  public ArrayList<Vehicle> areHumanPowered(ArrayList<Vehicle> vehicles)
  {
    ArrayList<Vehicle> humanPowered = new ArrayList<Vehicle>();
    for(Vehicle v : vehicles)
    {
      if (v.isHumanPowered() == true)
      {
        humanPowered.add(v);
      }
    }
    return humanPowered;
  }
}
