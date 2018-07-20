package p08_card_game;

public class Card implements Comparable<Card> {

    private Rank rank;
    private Suit suit;
    private String name;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.setName();
    }

    public String getName() {
        return this.name;
    }

    private void setName() {
        this.name = String.format("%s of %s", this.rank.name(), this.suit.name());
    }

    public int getPower() {
        return this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public int compareTo(Card other) {
        return this.getPower() - other.getPower();
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }
}
