public class Test {
    public static void main(String[] args) {
        EmployeeSystem system = new EmployeeSystem(10);

        system.addEmployee(new Employee(101, "Alice", "Manager", 80000));
        system.addEmployee(new Employee(102, "Bob", "Developer", 60000));

        System.out.println("All employees:");
        system.traverseEmployees();

        System.out.println("\nSearching for employee with ID 102:");
        Employee e = system.searchEmployee(102);
        System.out.println(e != null ? e : "Not found");

        system.deleteEmployee(102);
        System.out.println("\nAfter deleting employee with ID 102:");
        system.traverseEmployees();
    }
}