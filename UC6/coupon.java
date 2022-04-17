package Assignment6;

import java.util.Scanner;

public class coupon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of coupons:");
        int n = scanner.nextInt();
        char[] s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 99999);
            StringBuffer sb = new StringBuffer();
            while (random > 0) {
                sb.append(s[random % s.length]);
                random /= s.length;
            }
            String CouponCode = sb.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
    }
}
