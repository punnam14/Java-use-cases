package Assignment3;
import java.util.Arrays;

public class A9 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 4, 4, 6, 6, 7,7, 7, 6, 6, 5, 3, 3, 2, 2};
        int size = intArray.length;
        Arrays.sort(intArray);
        System.out.println("sorted Array ::"+Arrays.toString(intArray));
        int res = intArray[size-2];
        System.out.println("2nd largest element is ::"+res);
    }
}

