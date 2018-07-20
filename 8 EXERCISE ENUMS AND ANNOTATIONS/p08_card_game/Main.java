package p08_card_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Player firstPlayer = new Player(reader.readLine());
        Player secondPlayer = new Player(reader.readLine());

        Deck deck = new Deck();

        while (firstPlayer.getSize() < 5) {
            try {
                firstPlayer.addCard(deck.getCard(reader.readLine()));
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        while (secondPlayer.getSize() < 5) {
            try {
                secondPlayer.addCard(deck.getCard(reader.readLine()));
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        Player winner = getWinner(firstPlayer, secondPlayer);
        System.out.println(String.format("%s wins with %s.", winner.getName(), winner.getHighestCard()));
    }

    private static Player getWinner(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.getHighestCard().compareTo(secondPlayer.getHighestCard()) > 0) {
            return firstPlayer;
        }

        return secondPlayer;
    }
}
