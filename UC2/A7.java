package Assignment2;
import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        int reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int initial = num;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if ((reversed - initial) == 0)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome");
            }
}
