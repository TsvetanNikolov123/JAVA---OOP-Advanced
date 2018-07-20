package p07_deck_of_cards;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Deck deck = new Deck();

        deck.forEach(System.out::println);
    }
}
