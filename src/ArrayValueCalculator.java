import java.util.Scanner;

public class ArrayValueCalculator {


   public static int doCalc( String [][] given, int columns, int rows) {
       int ret = 0;
       try {
           for (int row = 0; row < rows; row++) {
               for (int column = 0; column < columns; column++) {
                   ret += Integer.parseInt(given[row][column]);
               }
           }
       } catch (NumberFormatException nfe) {
           nfe.printStackTrace();
           return -2;
       } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
           return -1;
       }
       return ret;
   }
}
