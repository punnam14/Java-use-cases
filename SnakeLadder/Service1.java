package SnakeLadder;

public class Service1 {

    public static int playerA = 0;
    public static int playerB = 0;


    private static final int ladder = 1;
    private static final int snake = 2;
    private static final int no_play = 0;
    private static final int maxPosition = 100;
    private static final int minPosition = 0;

    public static int getRandomInteger(int max, int min) {
        return ((int) (Math.random() * (max - min))) + min;
    }

    public static int chancePlayerA() {
        int dice = getRandomInteger(7,1);
        System.out.println("Dice value for player A: "+dice);

        int checkPlay = (int) Math.floor(Math.random()*10)%3;
        System.out.println("checkplay for A : "+checkPlay);

        switch(checkPlay) {
            case no_play:
                break;

            case ladder:
                playerA += dice;
                if(playerA > maxPosition) {
                    playerA = playerA-dice;
                }
                if(playerA == maxPosition) {
                    return playerA;
                }
                chancePlayerA();
                break;

            case snake:
                playerA -= dice;
                if(playerA < minPosition ) {
                    playerA = 0;
                }
                break;
        }
        System.out.println("Position of A : "+ playerA);
        return playerA;
    }

    public static int chancePlayerB() {
        int dice = getRandomInteger(7,1);
        System.out.println("Dice value for player B: "+dice);


        int checkPlay = (int) Math.floor(Math.random()*10)%3;
        System.out.println("checkplay for B : "+checkPlay);

        switch(checkPlay) {
            case no_play:
                break;

            case ladder:
                playerB += dice;
                if(playerB > maxPosition) {
                    playerB = playerB-dice;
                }
                if(playerB == maxPosition) {
                    return playerB;
                }
                chancePlayerB();
                break;

            case snake:
                playerB -= dice;
                if(playerB < minPosition ) {
                    playerB = 0;
                }
                break;
        }
        return playerB;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to snakes and ladders");

        int positionOfA = 0, positionOfB = 0;
        while(positionOfA < maxPosition || positionOfB < maxPosition) {

            positionOfA = chancePlayerA();
            if(positionOfA == maxPosition) {
                System.out.println("Position of A : "+ positionOfA);
                System.out.println("Position of B : "+ positionOfB);
                System.out.println("Player A has won");
                System.exit(0);
            }

            positionOfB = chancePlayerB();
            if(positionOfB == maxPosition) {
                System.out.println("Position of A : "+ positionOfA);
                System.out.println("Position of B : "+ positionOfB);
                System.out.println("Player B has won");
                System.exit(0);
            }
        }
    }
    }