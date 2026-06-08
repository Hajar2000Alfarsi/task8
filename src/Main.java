import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        //Add three employee

        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "John", "Sales"));

        //Display Employees
        System.out.println("Existing Employees: ");
        for (Employee employee : employees){
            System.out.println(employee);
        }

        //New Employee data
        Employee newEmployee = new Employee("E104", "Ali", "IT");

        //Validation - Check Duplicate ID
        boolean exists = false;

        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(newEmployee.getEmployeeId())){
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("\nEmployee ID already exists.");
            System.out.println("No employee was created.");
        } else {
            employees.add(newEmployee);

            System.out.println("\nEmployee Added Successfully");
            System.out.println("Employee ID: " + newEmployee.getEmployeeId());
            System.out.println("Employee Name: " + newEmployee.getEmployeeName());
            System.out.println("Department: " + newEmployee.getDepartment());
            System.out.println("Status: Created");
        }
    }
}