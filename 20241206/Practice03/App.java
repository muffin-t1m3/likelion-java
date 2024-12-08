import java.io.IOException;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws IOException {
        HashMap<String, Account> accounts = new HashMap<>();
        accounts.put("Steve", new Account());
        accounts.put("Tim", new Account());

        ATM atm = new ATM(accounts);

        while (true) {
            atm.performTransaction();
        }
    }
}
