package za.ac.cput.mzhartley.repository.user;

import za.ac.cput.mzhartley.domain.user.Employee;
import za.ac.cput.mzhartley.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {

    Set<Employee> getAll();
}
