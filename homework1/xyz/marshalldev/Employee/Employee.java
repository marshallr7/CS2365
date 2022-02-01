package xyz.marshalldev.Employee;

public record Employee(String name, int ID, String position) {

    @Override
    public String toString() {
        return "Employee " + name + ": " +
                "\n    ID #: " + ID +
                "\n    Position: " + position;
    }
}
