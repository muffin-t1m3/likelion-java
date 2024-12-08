public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.togglePower();
        tv.changeChannel(5);

        System.out.println(tv);
    }
}
