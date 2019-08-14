package za.ac.cput.mzhartley.repository.user.impl;

import za.ac.cput.mzhartley.domain.user.Employee;
import za.ac.cput.mzhartley.repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {

        Employee[] cloneOfEmployees = employees.toArray(new Employee[employees.size()]);
        for (int i = 0; i<cloneOfEmployees.length;i++) {
            if (cloneOfEmployees[i].equals(employee)) {
                employees.remove(cloneOfEmployees[i]);
            }
        }
        return create(employee);
    }

    @Override
    public void delete(String employeeId) {
        Employee[] cloneOfEmployees = employees.toArray(new Employee[employees.size()]);
        for (int i = 0; i<cloneOfEmployees.length;i++) {
            if (cloneOfEmployees[i].getEmployeeId() == employeeId) {
                if (employees.contains(cloneOfEmployees[i])){
                    employees.remove(cloneOfEmployees[i]);
                }
            }
        }
    }

    @Override
    public Employee read(String employeeId) {

        Employee employeeToReturn = null;

        Employee[] cloneOfEmployees = employees.toArray(new Employee[employees.size()]);

        for (int i = 0; i<cloneOfEmployees.length;i++) {
            if (cloneOfEmployees[i].getEmployeeId() == employeeId) {
                employeeToReturn = cloneOfEmployees[i];
            }
        }

        return employeeToReturn;
    }
}
