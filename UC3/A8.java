package Assignment3;

public class A8 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 4, 4, 6, 6, 7, 6, 6, 5, 3, 3, 2, 2};
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j< intArray.length; j++){
                if (intArray[i] == intArray[j]){
                    System.out.println("Element " +intArray[j]+ " has duplicates at position " +j );
                }
            }
        }
    }
}
