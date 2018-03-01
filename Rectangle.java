import java.awt.*;
public class Rectangle implements Shape
{
    private int x, y;
    private double radius;
    private Color c;
    private int length;
    private int width;
    
    
    public Rectangle(int x, int y, double radius, Color c)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.c = c;
        this.length = length;
        this.width = width;
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(x, y, width, length);
    }

    public double perimeter(){
        return (length * 2) + (width * 2);
    }
 
    public double area(){
        return width * length;
    }
}
