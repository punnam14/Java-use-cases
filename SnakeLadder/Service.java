package SnakeLadder;

import java.util.Random;

public class Service {

    public static void incPosition() {

        int position1 = 0;
        int position2 = 0;
        boolean flag = false;

        while ((position1 < 36 || position2 < 36) && (flag == false)) {
            Random random1 = new Random();
            int chance1 = random1.nextInt(7);
            position1 += chance1;

            Random random2 = new Random();
            int chance2 = random1.nextInt(7);
            position2 += chance2;

            Service.snakeLadder(position1, position2, flag);
            System.out.println("Position of player1 is: " + position1);
            System.out.println("Position of player2 is: " + position2);

            if (position1 == 36 || position2 == 36) {
                System.out.println("GAME END");
                break;
            }
        }
    }

    public static void snakeLadder(int position1, int position2, boolean flag) {

        if (position1 == 3 || position2 == 3) {
            position1 = 16;
            position2 = 16;
        } else if (position1 == 15 || position2 == 15) {
            position1 = 25;
            position2 = 25;
        } else if (position1 == 21 || position2 == 21) {
            position1 = 32;
            position2 = 32;
        } else if (position1 == 12 || position2 == 12) {
            position1 = 2;
            position2 = 2;
        } else if (position1 == 30 || position2 == 30) {
            position1 = 4;
            position2 = 4;
        } else if (position1 == 35 || position2 == 35) {
            position1 = 22;
            position2 = 22;
        } else if (position1 == 36 || position2 == 36) {
            if (position1 == 36) {
                flag = true;
                System.out.println("Player 1 wins");
            }
            if (position2 == 36) {
                flag = true;
                System.out.println("Player 2 wins");
            }

        }
    }
}
