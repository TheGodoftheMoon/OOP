import javax.swing.*;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tony Stark", 0001, "CEO of Stark Industries", 20000.0));
        employees.add(new Employee("Natasha Romanoff", 0002, "Expert Spy", 9000.0));
        employees.add(new Employee("Bruce Banner", 0003, "Physicist", 12000.0));
        employees.add(new Employee("Clint Barton", 0004, "Expert Marksman", 8500.0));
        employees.add(new Employee("Steve Rogers", 0005, "Super Soldier", 9500.0));
        employees.add(new Employee("Thor Son of Odin", 0006, "God of Thunder", 10000.0));
        String input = JOptionPane.showInputDialog(null, "Enter S.H.I.E.L.D Employee ID to view details:");
        try {
            int searchId = Integer.parseInt(input);
            boolean found = false;
            for (Employee emp : employees) {
                if (emp.getEmployeeId() == searchId) {
                    JOptionPane.showMessageDialog(null, emp.getEmployeeInfo(), "Employee Found", JOptionPane.INFORMATION_MESSAGE);
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "Employee with ID " + searchId + " not found.", "Not Found", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid numeric ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
