package Assignment2;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        int reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while(num != 0) { // run loop until num becomes 0
            int digit = num % 10; // get last digit from num
            reversed = reversed * 10 + digit;
            num /= 10; // remove the last digit from num
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
