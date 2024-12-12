public class Practice08 {

    public static void main(String[] args) {
        String randomString = "";
        randomString = null;

        try {
            System.out.println(randomString.length());
        } catch (NullPointerException e) {
            System.out.println("문자열이 null 상태입니다.");
        }
    }
}
