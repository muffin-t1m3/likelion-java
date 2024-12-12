public class Main {
    public static void main(String[] args) {
        ReadWritable fileHandler = new FileHandler();

        fileHandler.readContent();
        fileHandler.writeContent("hi");
    }
}
