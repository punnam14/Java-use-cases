package Assignment13;

public class findMax<dataType extends Comparable<dataType>>{

    dataType toCompare1, toCompare2, toCompare3;

    public findMax(dataType tocompare1, dataType tocompare2, dataType tocompare3) {
        this.toCompare1 = tocompare1;
        this.toCompare2 = tocompare2;
        this.toCompare3 = tocompare3;
    }

    public void testMaximum(){
        findMax.findMaximum(this.toCompare1, this.toCompare2, this.toCompare3);
    }

    public static <dataType extends Comparable<dataType>> void findMaximum(dataType firstNumber,
                                                                           dataType secondNumber,
                                                                           dataType thirdNumber){
        dataType maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0){
            maximumNumber = firstNumber;
        }else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0){
            maximumNumber = secondNumber;
        }else{
            maximumNumber = thirdNumber;
        }
        System.out.println("The maximum number is: " +maximumNumber);
    }

    public static void main(String[] args){

        System.out.println("Computing Maximum Of Three Numbers");

        Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
        Float number1 = 12f, number2 = 8f, number3 = 7f;
        String firstString = "Peach", secondString = "Banana", thirdString = "Apple";

        new findMax<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
        new findMax<Float>(number1, number2, number3).testMaximum();
        new findMax<String>(firstString, secondString, thirdString).testMaximum();
    }
}