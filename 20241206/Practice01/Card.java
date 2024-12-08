public class Card {
    private int number;
    private Suit suit;

    public Card(int number, int suit) {
        this.number = number;

        switch (suit) {
            case 0:
                this.suit = Suit.Hearts;
                break;
            case 1:
                this.suit = Suit.Diamonds;
                break;
            case 2:
                this.suit = Suit.Clubs;
                break;
            case 3:
                this.suit = Suit.Spades;
                break;
            default:
                throw new Error("Invalid suit number!");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
