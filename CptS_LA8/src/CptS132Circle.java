/**
 * Simple shape class, an abstraction of a circle.
 * 
 * @author Dan
 * @version 3 May 2011
 */
public class CptS132Circle extends CptS132Shape {
   
   /**
    * Create a circle.
    * @param d The diameter of the circle
    */
   public CptS132Circle(int d) {
      super(d, d);
   }
   
   /**
    * Returns the diameter of the circle object.
    * @return the diameter
    */
   public int getDiameter() {
      return getWidth();
   }
   
   /**
    * Returns the area of the circle object.
    * @return the area of the circle object
    */
   public double getArea() {
      return Math.PI * getDiameter() * getDiameter() / 4;
   }
   
}
