package Assignment8;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison");
        lineUseCases obj1 = new lineUseCases();

        double line1 =obj1.lengthLine();
        double line2 =obj1.lengthLine2();
        obj1.comparision(line1,line2);

    }
}