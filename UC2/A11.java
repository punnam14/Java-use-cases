package Assignment2;
import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your m and d: ");

        int m = sc.nextInt();
        int d = sc.nextInt();
        boolean isSpring =  ((m == 3 && 20 <= d && d <= 31) ||
                             (m == 4 && 01 <= d && d <= 30) ||
                             (m == 5 && 01 <= d && d <= 31) ||
                             (m == 6 && 01 <= d && d <= 20)) ;

        System.out.println(isSpring);

        }
    }
