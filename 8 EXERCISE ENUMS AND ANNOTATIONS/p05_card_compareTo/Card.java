package p05_card_compareTo;

public class Card implements Comparable<Card> {

    private Rank rank;
    private Suit suit;

    public Card(String rank, String suit) {
        this.rank = Rank.valueOf(rank.toUpperCase());
        this.suit = Suit.valueOf(suit.toUpperCase());
    }

    private int getPower() {
        return rank.getPower() + suit.getPower();
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getPower(), other.getPower());
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank, this.suit, getPower());
    }
}
