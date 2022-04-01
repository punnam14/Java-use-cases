package Assignment3;

public class A6 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 4, 4, 6, 6, 7, 6, 6, 5, 3, 3, 2, 2};
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println("Array in reverse is: " +intArray[i]);
        }
    }
}
