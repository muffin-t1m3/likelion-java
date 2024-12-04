public class Practice01 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int dan = 2; dan < 10; dan++) {
                System.out.print(dan + "*" + i + " = " + (dan * i) + "   \\t");
            }
            System.out.println();
        }
    }
}
