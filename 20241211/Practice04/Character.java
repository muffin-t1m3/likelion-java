public class Character {
    private Attackable attackStrategy;

    public void setAttackStrategy(Attackable attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }
}
