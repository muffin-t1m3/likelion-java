import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[2];
        Random random = new Random();
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(Integer.toString(random.nextInt(1000)));
        }
        Deck deck = new Deck();

        Game game = new Game(players, deck);
        game.start();
    }
}
