package cpts132.packages.temp;

/**
 * A simple supplier class that converts temperature values.
 */
public class Converter {

   public static double c2f(double f) {
      double c = (1.8 * f + 32);
      return c;
      
   }
   
}
