public class Game {
    private Player[] players;
    private Deck deck;

    public Game(Player[] players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }

    void start() {
        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            int player0Number = deck.draw().getNumber();
            int player1Number = deck.draw().getNumber();

            if (player0Number > player1Number) {
                System.out.println("Player 0 gets a point!");
                players[0].addScore(1);
            } else {
                System.out.println("Player 1 gets a point!");
                players[1].addScore(1);
            }
        }

        if (players[0].getScore() > players[1].getScore()) {
            System.out.println("Player 0 won!");
        } else {
            System.out.println("Player 1 won!");
        }
    }
}
