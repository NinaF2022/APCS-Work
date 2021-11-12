public class TestRectangle
{
  public static void testPerimeter(Rectangle rectangle, double expected)
  {
    double result = rectangle.perimeter();

    System.out.println("expected: " + expected + " result: " + result);

    if (Math.abs(expected - result) < 0.01)
    {
      System.out.println("yay!");
    }
    else
    {
      System.out.println("boo!");
    }
  }
  public static void testArea(Rectangle rectangle, double expected)
  {
    double result = rectangle.area();

    System.out.println("expected: " + expected + " result: " + result);

    if (Math.abs(expected - result) < 0.01)
    {
      System.out.println("yay!");
    }
    else
    {
      System.out.println("boo!");
    }
  }
  public static void testDiagonal(Rectangle rectangle, double expected)
  {
    double result = rectangle.diagonal();

    System.out.println("expected: " + expected + " result: " + result);

    if (Math.abs(expected - result) < 0.01)
    {
      System.out.println("yay!");
    }
    else
    {
      System.out.println("boo!");
    }
  }

  public static void doSomethingSneaky(Rectangle rectangle)
  {

  }

  public static void main(String[]args)
  {
    Rectangle a = new Rectangle(3, 4);

    doSomethingSneaky(a);

    System.out.println("a.perimeter: " + a.perimeter());
    System.out.println("a.area " + a.area());
    System.out.println("a.diagonal " + a.diagonal());

    Rectangle b = new Rectangle(5, 12);

    System.out.println("b.perimeter: " + b.perimeter());
    System.out.println("b.area: " + b.area());
    System.out.println("b.diagonal " + b.diagonal());

    testPerimeter(a, 14);
    testPerimeter(b, 34);
    testArea(a, 12);
    testArea(b, 60);
    testDiagonal(a, 5);
    testDiagonal(b, 13);
    }
}
