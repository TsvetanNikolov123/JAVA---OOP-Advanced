package p01_card_suit;

public class Main {
    public static void main(String[] args) {

        Suit[] suits = Suit.values();

        System.out.println("Card Suits:");
        for (Suit suit : suits) {
            System.out.println(suit);
        }
    }
}
