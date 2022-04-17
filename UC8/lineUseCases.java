package Assignment8;

import java.util.Scanner;

public class lineUseCases {
    Scanner sc = new Scanner(System.in);

    public double lengthLine() {
        System.out.print("Enter the value of X1:");
        int X1 =sc.nextInt();
        System.out.print("Enter the value of Y1: ");
        int Y1 =sc.nextInt();
        System.out.print("Enter the value of X2: ");
        int X2 =sc.nextInt();
        System.out.print("Enter the value of Y2: ");
        int Y2 =sc.nextInt();
        double lenghtOfLine= Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1));
        System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is  "+String.format("%.2f",lenghtOfLine));
        return lenghtOfLine;

    }

    public double lengthLine2() {
        System.out.print("Enter the value of X3: ");
        int X3 =sc.nextInt();
        System.out.print("Enter the value of Y3: ");
        int Y3 =sc.nextInt();
        System.out.print("Enter the value of X4: ");
        int X4 =sc.nextInt();
        System.out.print("Enter the value of Y4: ");
        int Y4 =sc.nextInt();
        double lenghtOfLine2= Math.sqrt((X4-X3)*(X4-X3) + (Y4-Y3) *(Y4-Y3));
        System.out.println("Distance between "+"("+X3+","+Y3+"),"+"("+X4+","+Y4+") is  "+String.format("%.2f",lenghtOfLine2));
        return lenghtOfLine2;
    }

    public void comparision(double lengthLine, double lengthLine2) {
        if (lengthLine == lengthLine2){
            System.out.println("The lengths of the two lines are equal");
        }else if (lengthLine > lengthLine2) {
            System.out.println("1st line is greater than 2nd line");
        }else{
            System.out.println("2nd line is greater than 1st line");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(lengthLine);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(lengthLine2);

        System.out.println(sb.compareTo(sb2));

    }
}
