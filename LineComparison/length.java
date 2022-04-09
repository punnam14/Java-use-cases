package LineComparison;

import java.util.Scanner;

public class length {

    public static void calcLength(double coordX1, double coordY1, double coordX2, double coordY2) {
        double length = Math.pow((Math.pow((coordX2 - coordX1), 2) + Math.pow((coordY2 - coordY1), 2)), 0.5);
        System.out.println("Distance between points (X1,Y1) and (X2,Y2): " +length);
    }

    public static void twoPoints(double coordX1, double coordY1, double coordX2, double coordY2,
                                double coordX3, double coordY3, double coordX4, double coordY4) {

        double length1 = Math.pow((Math.pow((coordX2 - coordX1), 2) + Math.pow((coordY2 - coordY1), 2)), 0.5);
        String str1 = Double.toString(length1);
        double length2 = Math.pow((Math.pow((coordX4 - coordX3), 2) + Math.pow((coordY4 - coordY3), 2)), 0.5);
        String str2 = Double.toString(length2);

        System.out.println("\nDistance between points (X1,Y1) and (X2,Y2): " +length1);
        System.out.println("Distance between points (X3,Y3) and (X4,Y4): " +length2);

        if (str1.equals(str2)){
            System.out.println("The two lengths are equal");
        }else if(length1 > length2){
            System.out.println("First line is greater than second line");
        }else{
            System.out.println("Second line is greater than first line");
        }
    }
}
