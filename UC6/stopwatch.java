package Assignment6;

import java.util.Scanner;

public class stopwatch {
    static double start = 0, stop = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        startWatch();
        System.out.println("Enter a number to stop: ");
        sc.next();
        startWatch();
        elapsedTime();
    }

    static void startWatch(){
        start = System.currentTimeMillis();
        System.out.println("Start time is: " +start);
    }

    static void stopWatch(){
        stop = System.currentTimeMillis();
        System.out.println("Stop time is: " +stop);
    }

    static void elapsedTime(){
        System.out.println("Elapsed time is: " +(start - stop) / 1000);
    }
}
