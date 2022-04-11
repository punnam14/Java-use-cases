package Assignment5;

import java.util.Scanner;

public class functional2 {
    public static void main(String ags[]){
            distance();
    }

    public static void distance(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter coordinates x and y");
            double x = sc.nextInt();
            double y = sc.nextInt();

            double eucledian = Math.pow((Math.pow(x,2) + Math.pow(y,2)),0.5);
            System.out.println("Distance between origin and ("+x+","+y+") is "+eucledian);
            sc.close();
        }catch (Exception error){
            System.out.println("enter integer only");
        }

    }
}
