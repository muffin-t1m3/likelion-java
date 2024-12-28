import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileWriterTask implements Runnable {
    @Override
    public void run() {
        try (Scanner scanner = new Scanner(System.in);
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8"))) {

            while (true) {
                String line = scanner.nextLine();

                if (line.equals("exit")) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }
}
