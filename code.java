/** This program constructs two points with coordinates (3, 4) and (–3, –4). 
Then, finds the distance between them, using the distance method. Prints the 
distance, as well as the expected value
 * @author (Fikri San Koktas)
 * @version (23 October 2020) */
import java.awt.Point;
import java.util.Scanner;
import java.awt.geom.Point2D;
public class KFS_PointTester_Main
{
    public static void main(String [] args)
    {
        Point p1 = new Point(3,4); // declares point 1 
        Point p2 = new Point(-3,-4); // declare point 2 
        
        System.out.println(p1); //prints point 1 
        System.out.println(p2); //prints point 2 
        
        double dist = p1.distance(p2);
        
        
        System.out.println("Actual Value: " + dist);
        System.out.println("Expected Value: 10");
        
    }
}


