public class ArrayInitialization
{
  public static void main (String [] args)
  {
    int [][] values = new int[10][10];
    for(int y=0; y<10; y++)
    {
      for(int x=0; x<10; x++)
      {
        if(x==y)
          values[y][x]=1;
        else
          values[y][x]=0;
      }
    }

    String [][] names = {{"hello", "bye", "farewell"}, {"cat", "dog", "rihno"}};

    double [][] numbers = new double [5][5];
    for(int y=0; y<5; y++)
    {
      double start = (y+1)*10;
      for(int x = 0; x<5; x++)
      {
          start += 1;
          numbers[y][x]=start;
      }
    }

    int [][] integers = new int [6][5];
    for(int y=0; y<6; y++)
    {
      for(int x = 0; x<5; x++)
      {
        integers[y][x]=y+1;
      }
    }

  }
}
