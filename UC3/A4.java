package Assignment3;

public class A4 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 4, 4, 6, 6, 7, 6, 6, 5, 3, 3, 2, 2};
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("MIN is " + min);
    }
}