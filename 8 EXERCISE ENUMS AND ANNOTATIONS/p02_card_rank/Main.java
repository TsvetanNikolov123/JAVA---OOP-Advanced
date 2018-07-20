package p02_card_rank;

public class Main {
    public static void main(String[] args) {

        FourteenRanks[] fourteenRanks = FourteenRanks.values();

        System.out.println("Card Ranks:");

        for (FourteenRanks fourteenRank : fourteenRanks) {
            System.out.println(fourteenRank);
        }
    }
}
