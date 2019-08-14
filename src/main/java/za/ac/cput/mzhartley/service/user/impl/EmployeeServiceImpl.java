package za.ac.cput.mzhartley.service.user.impl;

import za.ac.cput.mzhartley.domain.user.Employee;
import za.ac.cput.mzhartley.repository.user.EmployeeRepository;
import za.ac.cput.mzhartley.repository.user.impl.EmployeeRepositoryImpl;
import za.ac.cput.mzhartley.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }
}
