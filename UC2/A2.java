package Assignment2;

import java.util.Scanner;

public class A2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("Ones");
        }
        else if (number == 10){
            System.out.println("Tens");
        }
        else if (number == 100){
            System.out.println("Hundreds");
        }
        else if (number == 1000){
            System.out.println("Thousands");
        }
        else {
            System.out.println("Not valid");
        }
    }
}
