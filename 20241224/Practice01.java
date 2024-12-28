import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    String name;
    String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }
}


public class Practice01 {
    public static void main(String[] args) throws IOException {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name;
            String number;

            System.out.println("Type name:");
            name = scanner.nextLine();

            System.out.println("Type number:");
            number = scanner.nextLine();

            people.add(new Person(name, number));
        }

        PrintWriter pw = new PrintWriter(new FileOutputStream("phone.txt"));
        for (Person person : people) {
            pw.write("Name: " + person.name + "\n");
            pw.write("Number: " + person.number + "\n");
        }
        pw.close();

        BufferedReader br = new BufferedReader(new FileReader("phone.txt"));
        System.out.println("Here's your saved information!");
        String nextLine;
        while ((nextLine = br.readLine()) != null) {
            System.out.println(nextLine);
        }
        br.close();

        scanner.close();
    }
}
