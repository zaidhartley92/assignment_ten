package za.ac.cput.mzhartley.service.user;

import za.ac.cput.mzhartley.domain.user.EmployeeGender;
import za.ac.cput.mzhartley.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
