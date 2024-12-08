import java.util.Random;

public class Deck {
    public Card[] cards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Deck() {
        Card[] cards = new Card[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] =
                    new Card(
                            (int) (Math.random() * 13 + 1),
                            (int) (Math.random() * 3 + 1));
        }

        this.cards = cards;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int targetIndex = random.nextInt(i);
            Card temp = cards[targetIndex];
            cards[targetIndex] = cards[i];
            cards[i] = temp;
        }
    }

    public Card draw() {
        for (int i = cards.length - 1; i >= 0; i--) {
            if (cards[i] != null) {
                Card drawingCard = cards[i];
                cards[i] = null;
                return drawingCard;
            }
        }

        // Fallback but it shouldn't reach here within 5 draws.
        return cards[cards.length - 1];
    }
}
