package za.ac.cput.mzhartley.service.user;

import za.ac.cput.mzhartley.domain.user.Employee;
import za.ac.cput.mzhartley.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
