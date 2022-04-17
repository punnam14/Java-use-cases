package Assignment6;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till fibbonacci series: ");
        int n = sc.nextInt();

        int myArr[] = new int[30];
        myArr[0] = 0;
        myArr[1] = 1;

        for (int i = 1; i < n; i++) {
            myArr[i + 1] = myArr[i] + myArr[i - 1];
            System.out.println(myArr[i]);
        }
    }
}
