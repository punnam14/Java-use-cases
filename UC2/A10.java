package Assignment2;
import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int w = 0, x = 0, y = 0, z = 0;

        w = a + b * c;
        System.out.println("w = a + b * c: "+w);
        x = c + a / b;
        System.out.println("x = c + a / b: "+x);
        y = a % b + c;
        System.out.println("y = a % b + c: "+y);
        z = a * b + c;
        System.out.println("z = a * b + c: "+z);

        if (w > x && w > y && w > z) {
            System.out.println("greatest is w = a + b * c: "+w);
        }
        if (x > w && x > y && x > z) {
            System.out.println("greatest is x = c + a / b: "+x);
        }
        if (y > w && y > x && y > z) {
            System.out.println("greatest is y = a % b + c: "+y);
        }
        if (z > w && z > x && z > y) {
            System.out.println("greatest is z = a * b + c: "+z);
        }


    }
}
