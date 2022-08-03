package exercise.B13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    private List<Employee> employeeList;

    public EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public void insert(Employee employee) {
        employeeList.add(employee);
    }

    public Employee findById(String id) {
        return this.employeeList.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteById(String id) {
        Employee employee = findById(id);
        if (employee == null) {
            System.out.println("Invalid id");
            return;
        }
        employeeList.remove(employee);
        System.out.println("Delete finished");
        return;
    }

    public List<Employee> findByType(String type) {
        return this.employeeList.stream().filter(e -> {
            if (type == "0") {
                return e instanceof Experience;
            }
            if (type == "1") {
                return e instanceof Fresher;
            }
            if (type == "2") {
                return e instanceof Intern;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employeeList;
    }
}
