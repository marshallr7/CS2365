package xyz.marshalldev.Employee;

import xyz.marshalldev.GUI;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

    Set<Employee> employees = new HashSet<>();

    public TestEmployee() {
        generateEmployee();
        printEmployees();
    }

    private void generateEmployee() {
        int id;
        for (int i = 0; i < 3; i++) {
            String name = GUI.dialogTemplate("Enter employee name: ", "Employee " + (i+1));
            id = getID(i);
            String position = GUI.dialogTemplate("Enter employee position: ", "Employee " + (i+1));
            employees.add(new Employee(name, id, position));
        }
    }

    private void printEmployees() {
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }

    private int getID(int employeeNumber) {
        int id;
        try {
            id = Integer.parseInt(GUI.dialogTemplate("Enter employee ID: (ID must be an integer)", "Employee " + (employeeNumber+1)));
        } catch (NumberFormatException e) {
            return getID(employeeNumber);
        }
        return id;
    }
}
