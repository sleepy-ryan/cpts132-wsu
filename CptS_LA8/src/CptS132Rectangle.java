/**
 * Simple shape class, an abstraction of a rectangle.
 * 
 * @author Dan
 * @version 3 May 2011
 */
public class CptS132Rectangle extends CptS132Shape {
   
   /**
    * Create a rectangle.
    * @param h The height of the rectangle
    * @param w The width of the rectangle
    */
   public CptS132Rectangle(int w, int h) {
      super(w, h);
   }
   
   /**
    * Get the height of the rectangle object.
    * @return the height of the rectangle
    */
   public int getHeight() {
      return super.getHeight();
   }
   
   /**
    * Get the width of the rectangle object.
    * @return the width of the rectangle
    */
   public int getWidth() {
      return super.getWidth();
   }
   
   /**
    * Returns the area of the rectangle object.
    * @return the area of the rectangle object
    */
   public double getArea() {
      return getHeight() * getWidth();
   }
   
}
