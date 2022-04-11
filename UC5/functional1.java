package Assignment5;

import java.util.Scanner;

public class functional1 {
    public static void main(String args[]){
        sumZero();
    }

    public static void sumZero(){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter number of array elements: ");
        int n = sc.nextInt();

        int[] myArr = new int[n];
        int count = 0;

        System.out.println("Enter values of array size "+n+":");
        for(int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        for(int j = 0; j < myArr.length; j++){
            for(int k = j+1; k < myArr.length; k++){
                for(int l = k+1; l < myArr.length; l++){
                    if(myArr[j] + myArr[k] + myArr[l] == 0){
                        count++;
                        System.out.println("myArr["+j+"] + myArr["+k+"] + myArr["+l+"] sum is = 0");
                        System.out.println(myArr[j]+ " + " +myArr[k]+ " + " +myArr[l]+ " = 0");
                    }
                }
            }
        }

        System.out.println("total pairs are: "+count);
    }
}
