package za.ac.cput.mzhartley.service.demography.impl;

import za.ac.cput.mzhartley.domain.demography.Gender;
import za.ac.cput.mzhartley.repository.demography.GenderRepository;
import za.ac.cput.mzhartley.repository.demography.impl.GenderRepositoryImpl;
import za.ac.cput.mzhartley.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements  GenderService{
    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl(){
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService(){
        if (service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }
}
