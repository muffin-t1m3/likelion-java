public class App {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("Alice", new int[] {90, 85, 78});
        manager.addStudent("Bob", new int[] {88, 92, 80});
        manager.addStudent("Charlie", new int[] {70, 75, 65});

        manager.printAllStudents();
    }
}
