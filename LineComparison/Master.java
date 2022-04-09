package LineComparison;

import java.util.Scanner;

public class Master {
    public static void main(String [] args){
        System.out.println("Welcome to the line comparison computation program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 4 coordinates here: ");

        double coordX1 = sc.nextInt();
        double coordY1 = sc.nextInt();
        double coordX2 = sc.nextInt();
        double coordY2 = sc.nextInt();

        double coordX3 = sc.nextInt();
        double coordY3 = sc.nextInt();
        double coordX4 = sc.nextInt();
        double coordY4 = sc.nextInt();

        length.calcLength(coordX1, coordY1, coordX2, coordY2);
        length.twoPoints(coordX1, coordY1, coordX2, coordY2, coordX3, coordY3, coordX4, coordY4);
    }
}
