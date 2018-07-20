package p05_card_compareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank1 = reader.readLine();
        String suit1 = reader.readLine();

        String rank2 = reader.readLine();
        String suit2 = reader.readLine();

        try {
            Card card1 = new Card(rank1, suit1);
            Card card2 = new Card(rank2, suit2);

            if (card1.compareTo(card2) > 0) {
                System.out.println(card1.toString());
            } else {
                System.out.println(card2.toString());
            }
        } catch (IllegalArgumentException ignored) {
            ;
        }
    }
}
