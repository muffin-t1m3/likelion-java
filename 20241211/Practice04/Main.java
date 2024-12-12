public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.setAttackStrategy(new BowAttack());
        character.performAttack();
        character.setAttackStrategy(new SwordAttack());
        character.performAttack();
    }
}
