class EmployeeSystem {
    Employee[] employees;
    int size;

    EmployeeSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
        }
    }

    Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    void deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                break;
            }
        }
    }

    void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}