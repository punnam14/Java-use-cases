package Assignment3;

public class A2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 1, 4,4,6,1,6,7,6,6,5,3,3,2,2};
        int [] result = new int[intArray.length];
        int visited = -1;

        for(int i = 0; i < intArray.length; ++i) {
            int counter = 1 ;
            for(int j = i+1; j < intArray.length ; j++) {
                if (intArray[i] == intArray[j]) {
                    counter++;
                    result[j] = visited;
                }
            }
            if(result[i] != visited)
                result[i] = counter ;
            }
        System.out.println(" Element | Frequency");
        for(int i = 0; i < result.length; i++){
            if(result[i] != visited)
                System.out.println("    " + intArray[i] + "    |    " + result[i]);
        }
        }
}
