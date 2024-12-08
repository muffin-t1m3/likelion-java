public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Steve"),
                new Player("Tim"),
                new Player("Bill")
        };

        DiceGame game = new DiceGame(players);
        game.play();
    }
}
