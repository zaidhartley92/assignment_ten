package za.ac.cput.mzhartley.factory.user;

import za.ac.cput.mzhartley.domain.user.EmployeeGender;
import za.ac.cput.mzhartley.util.Misc;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String newEmployeeId, String newGenderId){
        return new EmployeeGender.Builder()
                .employeeId(newEmployeeId)
                .genderId(newGenderId)
                .build();
    }
}
