package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class A3 {
    public static void main(String args[])
    {
        Q3();
    }
    static void Q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a string: ");
        String str2 = sc.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }
    }
}