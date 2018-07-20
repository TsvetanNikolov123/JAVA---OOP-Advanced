package p05_card_compareTo;

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
