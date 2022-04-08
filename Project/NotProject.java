import processing.core.*;

public class NotProject extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        x = width/2;
        y = height/2;
        vx = 3;
        vy = 2;

    }

    public void draw()
    {
        background(0);
        ellipse(x, y, 100, 50);

        x = x + vx;
        y = y + vy;

        if(x > width || x < 0)
        {
          vx = vx * -1;
        }
        if(y > height || y < 0)
        {
          vy = vy * -1;
        }
    }

    private float x;
    private float y;
    private float vx;
    private float vy;

    public static void main(String[] args)
    {
        PApplet.main("Project");
    }
}
