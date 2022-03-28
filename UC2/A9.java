package Assignment2;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                System.out.println("Month: January");
                break;
            case 2:
                System.out.println("Month: Feb");
                break;
            case 3:
                System.out.println("Month: Mar");
                break;
            case 4:
                System.out.println("Month: Apr");
                break;
            case 5:
                System.out.println("Month: May");
                break;
            case 6:
                System.out.println("Month: June");
                break;
            case 7:
                System.out.println("Month: July");
                break;
            case 8:
                System.out.println("Month: Aug");
                break;
            case 9:
                System.out.println("Month: Sept");
                break;
            case 10:
                System.out.println("Month: Oct");
                break;
            case 11:
                System.out.println("Month: Nov");
                break;
            case 12:
                System.out.println("Month: Dec");
                break;
            default:
                System.out.println("Invalid Data.");

        }
    }
}