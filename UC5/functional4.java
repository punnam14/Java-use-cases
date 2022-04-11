package Assignment5;

import java.util.Scanner;

public class functional4 {
    public static void main(String args[]){
        windchill();
    }
    public static void windchill(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature between -58ºF and 41ºF: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) +
                           0.4275 * temperature * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + windChill);
    }
}
