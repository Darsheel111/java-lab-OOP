import java.util.Scanner;

enum Coin {
    ONE, TWO, FIVE, TEN
}

public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SNACK_PRICE = 15;
        int total = 0;

        while (total < SNACK_PRICE) {

            System.out.print("Enter Coin (ONE,TWO,FIVE,TEN): ");
            String coinName = sc.next().toUpperCase();

            Coin coin = Coin.valueOf(coinName);

            int value = switch (coin) {
                case ONE -> 1;
                case TWO -> 2;
                case FIVE -> 5;
                case TEN -> 10;
            };

            total += value;

            System.out.println("Total so far: " + total);
        }

        int change = total - SNACK_PRICE;

        System.out.println("Paid!");
        System.out.println("Change: " + change);

        sc.close();
    }
}