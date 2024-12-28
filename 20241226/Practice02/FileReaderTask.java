import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReaderTask implements Runnable {
    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("output.txt"), "UTF-8"));) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
