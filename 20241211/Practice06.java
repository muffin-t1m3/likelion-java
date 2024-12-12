import java.util.Scanner;

public class Practice06 {
    protected static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        try {
            System.err.println(divide(input1, input2));
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            scanner.close();
        }
    }
}
