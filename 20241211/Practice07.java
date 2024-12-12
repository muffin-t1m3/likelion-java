import java.util.Scanner;

public class Practice07 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        try {
            System.out.println(arr[input]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 확인하세요!");
        } finally {
            scanner.close();
        }
    }
}
