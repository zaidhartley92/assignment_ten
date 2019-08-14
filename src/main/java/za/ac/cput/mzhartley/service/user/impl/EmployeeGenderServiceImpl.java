package za.ac.cput.mzhartley.service.user.impl;

import za.ac.cput.mzhartley.domain.user.EmployeeGender;
import za.ac.cput.mzhartley.repository.user.EmployeeGenderRepository;
import za.ac.cput.mzhartley.repository.user.impl.EmployeeGenderRepositoryImpl;
import za.ac.cput.mzhartley.service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {
    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }
}
