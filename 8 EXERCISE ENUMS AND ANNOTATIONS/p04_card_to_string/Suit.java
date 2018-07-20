package p04_card_to_string;

public enum Suit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    private Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
