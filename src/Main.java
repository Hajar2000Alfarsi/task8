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


    }
}