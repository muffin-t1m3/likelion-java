import java.util.TreeSet;

public class Practice02 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i);
            numbers.add(i);
        }

        for (Integer item : numbers) {
            System.out.println(item);
        }
    }
}
