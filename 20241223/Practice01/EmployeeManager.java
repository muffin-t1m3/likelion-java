import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee newEmployee) {
        boolean isExisting = false;

        for (Employee checkingEmployee : employees) {
            if (checkingEmployee.equals(newEmployee)) {
                isExisting = true;
            }
        }

        if (!isExisting) {
            employees.add(newEmployee);
        } else {
            System.out.println("Employee already exists");
        }
    }

    public void removeEmployee(Employee targetEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == targetEmployee.id) {
                employees.remove(i);
            }
        }
    }

    public Employee findEmployee(String id) {
        for (Employee employee : employees) {
            if (employee.id.equals(id)) {
                return employee;
            }
        }

        return null;
    }

    public void listEmployee() {
        System.out.println(employees);
    }
}
