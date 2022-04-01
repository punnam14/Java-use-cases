package Assignment3;

public class A5 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 4, 4, 6, 6, 7, 6, 6, 5, 3, 3, 2, 2};
        for (int i = 0; i < intArray.length; i = i + 2) {
            System.out.println("Number in even pos is: " + intArray[i]);
        }
    }
}
