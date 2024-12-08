public class Dice {
    private int sides = 6;

    public Dice(int sides) {
        this.sides = sides;
    }

    int roll() {
        System.out.println((int) Math.random() * sides + 1);
        return (int) (Math.random() * sides) + 1;
    }
}
