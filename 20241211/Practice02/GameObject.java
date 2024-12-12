public class GameObject implements Movable, Drawable {
    int x;
    int y;

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("객체가 (" + x + ", " + y + ") 에 그려졌습니다.");
    }
}
