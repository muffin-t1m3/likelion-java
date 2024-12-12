public class Practice09 {

    public static void main(String[] args) {
        String numStr = "123a";

        try {
            System.out.println(Integer.parseInt(numStr));
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값은 정수로 변환할 수 없습니다.");
        }
    }
}
