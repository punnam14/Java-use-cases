package Assignment7;

import java.util.Random;

public class gambling {
    int stake = 100;
    int won = 0;
    int lost = 0;
    Random rand = new Random();

    public static void main(String[] args) {
        gambling call = new gambling();
        call.bet();
    }

    public void bet(){

        for(int i = 1; i < 20; i++ ){
            while(stake > 50){
                int n = rand.nextInt(2);
                if(n == 0){
                    lost += 1;
                    stake -= 1;
                    System.out.println("Bet Lost, available sum: " +stake);

                }else{
                    won += 1;
                    stake += 1;
                    System.out.println("Bet Won, available sum: " +stake);
                }
            }
            System.out.println("Stake is at " +stake+ " , Resigning for the night, dollars won " +won+ " , dollars lost " +lost);
        }
    }
}
