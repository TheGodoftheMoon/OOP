public class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double monthlySalary;

    public Employee() {
        this.name = "Unknown";
        this.employeeId = 0;
        this.department = "None";
        this.monthlySalary = 0.0;
    }

    public Employee(String name, int employeeId, String department, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public String getEmployeeInfo() {
        return "Employee Information:\n"
             + "Name: " + name + "\n"
             + "Employee ID: " + employeeId + "\n"
             + "Department: " + department + "\n"
             + "Monthly Salary: $" + monthlySalary + "\n"
             + "Annual Salary: $" + calculateAnnualSalary();
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
