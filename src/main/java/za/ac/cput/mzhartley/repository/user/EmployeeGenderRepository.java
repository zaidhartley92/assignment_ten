package za.ac.cput.mzhartley.repository.user;

import za.ac.cput.mzhartley.domain.user.EmployeeGender;
import za.ac.cput.mzhartley.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {

    Set<EmployeeGender> getAll();
}
