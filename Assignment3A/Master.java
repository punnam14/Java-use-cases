package Assignment3A;

import static Assignment3A.AbsentCheck.*;

public class Master {
    public static void main(String [] args){
        System.out.println("Welcome to the employee wage computation program");
        AbsentCheck.present();
        AbsentCheck.dailyWage();
        AbsentCheck.hourCheck();
    }
}
