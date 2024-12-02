public class Practice04 {
    public static void main(String[] args) {
        int width = 12;
        int height = 6;

        int tempWidth = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < tempWidth; j++) {
                System.out.print("*");
            }

            if (tempWidth < width) {
                tempWidth += width / height;
            }
            System.out.print("\n");
        }
    }
}
