public class DiceGame {
    private Player[] players;
    private Dice dice;

    public DiceGame(Player[] players) {
        if (players.length < 2 || players.length > 4) {
            throw new Error("Number of players much be more than 0 and less than 5!");
        }
        this.players = players;
        this.dice = new Dice(6);
    }

    public DiceGame(Player[] players, Dice dice) {
        if (players.length < 2 || players.length > 4) {
            throw new Error("Number of players much be more than 0 and less than 5!");
        }
        this.players = players;
        this.dice = dice;

    }

    void play() {
        int round = 1;
        while (true) {
            System.out.println("Round " + round + ":");
            for (Player player : players) {
                int rolledNumber = dice.roll();
                player.addScore(rolledNumber);
                System.out.println(player.getName() + " rolls " + rolledNumber);
            }


            System.out.println();
            boolean isOver = getWinner();

            if (isOver && round >= 3) {
                break;
            }

            round++;
        }
    }

    boolean getWinner() {
        Player highestPlayer = players[0];

        for (int i = 1; i < players.length; i++) {
            if (highestPlayer.getScore() == players[i].getScore()) {
                return false;
            }
            if (highestPlayer.getScore() > players[i].getScore()) {
                highestPlayer = players[i];
            }
        }

        System.out.println("Winner:");
        System.out.println(highestPlayer.getName());
        return true;
    }
}
