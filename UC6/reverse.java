package Assignment6;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int reverse = 1;

        while(n != 0){
            int m = n % 10;
            reverse = (reverse * 10) + m;
            n = n / 10;
        }

    }
}
