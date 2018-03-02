import java.awt.*;
public class Rectangle implements Shape
{
    private int x, y;
    private double radius;
    private Color c;
    private int length;
    private int width;
    
    
    public Rectangle(int x, int y, Color c)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.c = c;
        this.length = 150;
        this.width =  100;
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(x, y,width,length);
        String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
        g.drawString( perArea, x, y -10);
    }

    public double perimeter(){
        return (length * 2) + (width * 2);
    }
 
    public double area(){
        return width * length;
    }
}
