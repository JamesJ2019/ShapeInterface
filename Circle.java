import java.awt.*;

public class Circle implements Shape
{
    // instance variables - replace the example below with your own
    private int x, y;
    private double radius;
    private Color c;
    
    public Circle(int x, int y, double radius, Color c)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.c = c;
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillOval(x, y, (int)radius * 2, (int)radius * 2);
        //String perArea = "Perim: " + perimeter() + " Area: " + area();
        String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
        g.drawString( perArea, x, y -10);
    }
 
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
