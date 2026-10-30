package cardgame;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return String.format(
                "Card: { " +
                "Suit: %s " +
                "Rank: %s }",
                suit, rank
        );
    }
}