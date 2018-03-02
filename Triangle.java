import java.awt.*;

public class Triangle implements Shape
{
    // instance variables - replace the example below with your own
    private int x, y;
    private double radius;
    private Color c;
    private int leg1;
    private int leg2;
    public Triangle(int x, int y, Color c)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.c = c;
        this.leg1 = leg1;
        this.leg2 = leg2;
       
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillPolygon(new int [] {150 + x,x - 50,150 + x}, new int [] {y,y + 100,y + 100},3);
        String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
        g.drawString( perArea, x, y -10);
    }
 
    public double perimeter(){
        return leg1 + leg2 + Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    public double area(){
        return (leg1*leg2)/ 2;
    }
}