import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    List<String> getUserInput() {
        List<String> returningValue = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    break;
                } else {
                    returningValue.add(line);
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return returningValue;
    }
}
