package p03_cards_with_power;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(String rank, String suit) {
        this.rank = Rank.valueOf(rank.toUpperCase());
        this.suit = Suit.valueOf(suit.toUpperCase());
    }

    private int setPower() {
        return rank.getPower() + suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank, this.suit, setPower());
    }
}
