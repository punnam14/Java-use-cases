package Assignment2;
import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);

        }
    }
}