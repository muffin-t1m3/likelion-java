import java.util.Arrays;
import java.util.List;

class Practice03 {
    public static void main(String[] var0) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2);

        int sum = 0;

        for (int n : nums) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
    }
}
