import java.awt.*;
import java.util.ArrayList;
/**
 * Benefits of polymorphism shown here:
 * polymorphism:    Ability for the same code to be used with 
 *                  different types of objects and behave 
 *                  differently with each.
 *
 *
 * @author (Mrs. Hardy)
 * @version (1.1)
 */
public class ShapeClient
{
    public static void main(String args[])
    {
      DrawingPanel draw = new DrawingPanel(1200,1200);
      Graphics g = draw.getGraphics();
      int startX = 100;
      int startY = 250;
      
      Circle c = new Circle(startX, startY, startX/3, Color.BLUE);
      Rectangle r = new Rectangle(startX * 5, startY, Color.BLUE);
      Triangle t = new Triangle(startX * 3, startY, Color.BLUE);
      
      c.draw(g);
      r.draw(g);
      t.draw(g);
      printInfo(c,r,t);
    } 
    
    public static void printInfo(Shape s, Shape r, Shape t){
        System.out.println("The shape is : " + s);
        System.out.println("area : " + s.area() );
        System.out.println("perimeter : " + s.perimeter() );
        System.out.println("The shape is : " + r);
        System.out.println("area : " + r.area() );
        System.out.println("perimeter : " + r.perimeter() );
        System.out.println("The shape is : " + t);
        System.out.println("area : " + t.area() );
        System.out.println("perimeter : " + t.perimeter() );
    }
    
    
    
}
