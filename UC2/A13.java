package Assignment2;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your x and y coordinates: ");

        double x = sc.nextInt();
        double y = sc.nextInt();

        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
