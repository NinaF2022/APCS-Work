public class Rectangle
{
  public Rectangle(double height, double base)
  {
    this.height = height;
    this.base = base;
  }

  public double perimeter()
  {
    return 2*height + 2*base;
  }

  public double area()
  {
    return base*height;
  }

  public double diagonal()
  {
    return Math.sqrt(base*base + height*height);
  }

  private double height;
  private double base;
}
