package za.ac.cput.mzhartley.controller;

import za.ac.cput.mzhartley.domain.demography.Gender;
import za.ac.cput.mzhartley.domain.demography.Race;
import za.ac.cput.mzhartley.domain.user.Employee;
import za.ac.cput.mzhartley.domain.user.EmployeeGender;
import za.ac.cput.mzhartley.factory.demography.GenderFactory;
import za.ac.cput.mzhartley.factory.demography.RaceFactory;
import za.ac.cput.mzhartley.factory.user.EmployeeFactory;
import za.ac.cput.mzhartley.factory.user.EmployeeGenderFactory;
import za.ac.cput.mzhartley.service.demography.GenderService;
import za.ac.cput.mzhartley.service.demography.impl.GenderServiceImpl;
import za.ac.cput.mzhartley.service.demography.impl.RaceServiceImpl;
import za.ac.cput.mzhartley.service.demography.RaceService;
import za.ac.cput.mzhartley.service.user.EmployeeGenderService;
import za.ac.cput.mzhartley.service.user.EmployeeService;
import za.ac.cput.mzhartley.service.user.impl.EmployeeGenderServiceImpl;
import za.ac.cput.mzhartley.service.user.impl.EmployeeServiceImpl;

public class Main {

    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public boolean create(String firstName, String lastName, String genderName, String raceName) {

        boolean success = false;
        try {
            Employee employee = EmployeeFactory.buildEmployee(firstName, lastName);
            employeeService.create(employee);

            Race race = RaceFactory.buildRace(raceName);
            raceService.create(race);

            Gender gender = GenderFactory.buildGender(genderName);
            genderService.create(gender);

            EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(employee.getEmployeeId(), gender.getGenderId());
            employeeGenderService.create(employeeGender);

            success = true;

        } catch (Exception e){
            success = false;
        }

        return success;

    }
}