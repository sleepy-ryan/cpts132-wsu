/**
 * Ryan Garbutt
 * Spring 2021
 * CptS 132
 * Learning Activity 3: Packages
 * Check
 */


package cpts132.packages;

import cpts132.packages.string.Double;
import cpts132.packages.temp.Converter;

/**
 * A simple class that uses classes in named packages.
 */
public class TempTable {

   /**
    * A program that prints out a temperature conversion table
    * @param args The command-line arguments
    */
   public static void main(String[] args) {

      Converter convert = new Converter();
      Double frmt = new Double();

      double c,f;

      System.out.println("Celsius  Fahrenheit");

      for (int i = 0; i <=10 ; i++) {
         c = i * 10.0;
         f = convert.c2f(c);

         System.out.println(frmt.format1(c)+" "+frmt.format3(f));
      }
      
      // print out values
      
   }
   
}
