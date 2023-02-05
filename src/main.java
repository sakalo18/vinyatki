import java.util.Scanner;

public class main extends ArrayValueCalculator {

    public static void main(String[] args) {
        String [][] arrcalc = new String [][]{
                {"01", "02","03","04"},
                {"11", "12","03","04"},
                {"21", "22","03","04"},
                {"31", "32","03","04"}
        };

        int sum = ArrayValueCalculator.doCalc(arrcalc, 4,4);

        System.out.println("Result is " + sum);
    }
}