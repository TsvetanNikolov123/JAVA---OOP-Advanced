package p02_card_rank;

public enum FourteenRanks {

    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    @Override
    public String toString() {
        return "Ordinal value: " + this.ordinal() +
                "; Name value: " + this.name();
    }
}
