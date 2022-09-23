package cpts132.packages.string;

/**
 * A class to handle conversion of double values to String representations.
 */
public class Double {

   /**
    * Creates a String representation of the given double value.
    * The string representation will have one place following the
    * decimal point and be right justified within an output string
    * of six characters.
    *
    * @param value The double value to be formatted
    * @return The formatted string
    */
   public static String format1(double value) {
      String str = String.format("%6.1f", value);

      return str;

   }

   /**
    * Creates a String representation of the given double value.
    * The string representation will have three places following the
    * decimal point and be right justified within an output string
    * of twelve characters.
    *
    * @param value The double value to be formatted
    * @return The formatted string
    */
   public static String format3(double value) {
      String str = String.format("%12.3f", value);

      return str;

   }

   public double format(double value){
      return value;

   }

}
   
