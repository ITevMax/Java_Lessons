package cardgame;

import java.util.ArrayList;

public class Main {
    static void main() {
        var stackOfCards = new ArrayList<Card>(52);

        for (var suit : Suit.values())
            for (var rank : Rank.values())
                stackOfCards.add(new Card(suit, rank));

        for (var card : stackOfCards)
            System.out.println(card);
    }
}