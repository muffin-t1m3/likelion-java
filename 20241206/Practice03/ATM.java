import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    private HashMap<String, Account> accounts;
    private Scanner scanner;

    public ATM(HashMap<String, Account> accounts) {
        this.accounts = accounts;
        this.scanner = new Scanner(System.in);
    }

    public void performTransaction() {
        while (true) {
            System.out.println("Enter Your name:");
            String name = scanner.nextLine();
            Account usingAccount = accounts.get(name);

            if (usingAccount != null) {
                runATMSession(usingAccount);
                break;
            } else {
                System.out.println("Account not found. Please try again.");
            }
        }
    }

    private int getValidOption(int min, int max) {
        // Makes sure the user selects a valid option within the range.
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.println("Invalid choice! Please select a number between "
                            + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private void runATMSession(Account usingAccount) {
        while (true) {
            System.out.println();
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Choose an option");

            int option = getValidOption(1, 4);

            switch (option) {
                case 1:
                    usingAccount.checkBalance();
                    break;
                case 2:
                    usingAccount.deposit(getAmount());
                    break;
                case 3:
                    usingAccount.withdraw(getAmount());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return; // Exit the session
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private double getAmount() {
        while (true) {
            System.out.println("Type amount:");
            try {
                double value = Double.parseDouble(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
