package Assignment1;
import java.util.Scanner;

public class A7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(leapYear(sc.nextInt()) ? "leap year" : "Not a leap year");
    }
    public static boolean leapYear(int year) {
        return year >= 1586 ? year % 4  == 0 && year % 100 != 0 ||  year % 400 == 0 ? true : false : false;
    }

}
