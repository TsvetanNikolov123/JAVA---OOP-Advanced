package p01_card_suit;

public enum Suit {

    CLUBS, DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return "Ordinal value: " + this.ordinal() +
                "; Name value: " + this.name();
    }
}
