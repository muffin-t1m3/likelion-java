import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }

    void writeToFile(List<String> userInput) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("text-manager.txt"), "UTF-8"));) {
            for (String input : userInput) {
                writer.write(input + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    List<String> readFromFile() {
        List<String> returningList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("text-manager.txt"), "UTF-8"));) {
            String line;
            while ((line = reader.readLine()) != null) {
                returningList.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return returningList;
    }
}
