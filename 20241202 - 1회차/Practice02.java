class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}


public class Practice02 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(30, 5);
        System.out.println(rect.getArea()); // 150
    }
}
