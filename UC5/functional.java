package Assignment5;

import java.util.Scanner;

public class functional {
    public static void main(String args[]){
        array2D();
    }

    public static void array2D(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column size: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] myArr = new int[row][col];

        System.out.println("Enter 2D array elements: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j<col; j++){
                System.out.println("Element["+i+"]["+j+"]:");
                myArr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEntered 2D array is: ");
        for(int[] i : myArr){
            for(int j : i){
                System.out.println(j+ " ");
            }
        }

    }
}
