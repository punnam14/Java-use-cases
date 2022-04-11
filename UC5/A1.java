package Assignment5;

import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class A1 {

    public static void main(String args[]) {
        //tailsHeads();
        //leapYear();
        //pow2();
        //harmonic();
        //prime();
        //quoRem();
        //swap();
        //evenOdd();
        //vowel();
    }

    public static void tailsHeads() {
        int tails = 0;
        int heads = 0;
        int percentT = 0;
        int percentH = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times to flip: ");
        int times = sc.nextInt();

        Random random1 = new Random();

        for (int i = 0; i < times; i++) {
            int chance = random1.nextInt(2);
            if (chance < 0.5) {
                System.out.println("Tails");
                tails += 1;
            } else {
                System.out.println("Heads");
                heads += 1;
            }
        }
        percentT = (tails * 100) / times;
        percentH = (heads * 100) / times;

        System.out.println("Percentage of heads and tails is: " + percentH + " and " + percentT);
    }

    public static void leapYear() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    public static void pow2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exponent number: ");
        int exp = sc.nextInt();
        int power = 1;
        int base = 2;

        if (exp < 31) {
            for (int i = 1; i <= exp; i++)
                power = power * base;
        }
        System.out.println("Result of " + base + " power " + exp + " is " + power);
    }

    public static void harmonic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int num = sc.nextInt();
        double result = 0.0;

        System.out.println("The harmonic series is: ");
        for (int i = num; i > 0; i--) {
            result = result + (double) 1 / i;
            System.out.print(result + ", ");
        }
    }

    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println("factor: " + i);
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }

    public static void quoRem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter your divisor");
        int divisor = sc.nextInt();

        int remainder = dividend % divisor;
        int quotient = (dividend - remainder) / divisor;
        System.out.println(+dividend + " divided by " + divisor + " gives remainder " + remainder + " and quotient " + quotient);
    }

    public static void swap() {
        int a = 3;
        int b = 4;
        System.out.println("a is " + a + " b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("AFTER SWAP - a is " + a + " b is " + b);
    }

    public static void evenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void vowel() {
        char character;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Alphabet: ");
        character = scanner.next().charAt(0);

        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' ||
                character == 'i' || character == 'I' || character == 'o' || character == 'O' ||
                character == 'u' || character == 'U') {
            System.out.print(character + " is a Vowel");
        } else {
            System.out.print(character + " is a Consonant");
        }
    }
}


