public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    void addScore(int points) {
        this.score += points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
