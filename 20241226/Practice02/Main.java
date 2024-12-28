public class Main {
    public static void main(String[] args) {
        Thread writer = new Thread(new FileWriterTask());
        writer.start();
    }
}
