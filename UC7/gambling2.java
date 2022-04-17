package Assignment7;

public class gambling2 {
    double amount = 100d;
    final double BETTING_AMOUNT = 1d;
    final double BETTING_RANGE_WIN = 150d;
    final double BETTING_RANGE_LOSE = 50d;
    double winnings = 0;
    int wins = 0;
    int winMax = 0;
    int loss = 0;
    int lossMax = 0;
    int luckyDay = 0;
    int worstDay = 0;

    public void round() {
        int win = (int)(Math.random() * 2);
        if (win == 1) {
            amount += BETTING_AMOUNT;
            wins++;
        }
        else {
            amount -= BETTING_AMOUNT;
            loss++;
        }
    }

    public void gamble() {

        while (amount > BETTING_RANGE_LOSE && amount < BETTING_RANGE_WIN) {
            round();
        }
        if(amount == 150){
            winnings += 50;
            System.out.println(" Gambler won 50$ today");
        }
        else{
            winnings -= 50;
            System.out.println(" Gambler lost 50$ today");
        }
    }

    public void gambleForMonth() {

        for (int days = 0; days < 30; days++) {
            System.out.println("\n DAY " + days);
            gamble();
            if(wins > winMax) {
                winMax = wins;
                luckyDay = days + 1;
            }
            if(loss > lossMax) {
                lossMax = loss;
                worstDay = days + 1;
            }

            wins = 0;
            loss = 0;

            if (winnings >= 0)
                System.out.println(" The gambler has won " +winnings+ " so far");
            else
                System.out.println(" The gambler has lost " +(-winnings)+ " so far");
            amount = 100d;
        }
        System.out.println(" The luckiest day you had was day " + luckyDay + " with winnings of " + winMax);
        System.out.println(" The worst day you had was day " + worstDay + " with losses of " + lossMax);
    }

    public void shouldTheyGamble() {
        int count = 1;
        do{
            System.out.println("\n MONTH: " + count + " ==> Decided to play for one more month");
            gambleForMonth();
            count++;
        }while (winnings > 0);
    }

    public static void main(String[] args) {
        gambling2 gamble = new gambling2();
        gamble.shouldTheyGamble();

    }
}
