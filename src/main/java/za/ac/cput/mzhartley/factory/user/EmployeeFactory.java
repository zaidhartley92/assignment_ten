package za.ac.cput.mzhartley.factory.user;

import za.ac.cput.mzhartley.domain.user.Employee;
import za.ac.cput.mzhartley.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String firstName, String lastName){
        return new Employee.Builder()
                .employeeId(Misc.generateID())
                .employeeFirstName(firstName)
                .employeeLastName(lastName)
                .build();
    }
}