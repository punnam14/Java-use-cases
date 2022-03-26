package Assignment1;

public class A4 {
    public static void main(String [] args){
        int sum = 0;
        int invalid  = 0;
        for (int i = 0 ; i < args.length ; i++){
        try {
            sum += Integer.parseInt(args[i]);
        }
        catch (NumberFormatException n) {
                invalid++;
            }
            }
        System.out.println("Total number of arguments is: " +args.length);
        System.out.println("Invalid entires is: " +invalid);
        System.out.println("Total Sum of arguments is: " +sum);
    }
}
