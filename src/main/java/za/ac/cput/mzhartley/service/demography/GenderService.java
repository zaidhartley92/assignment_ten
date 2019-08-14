package za.ac.cput.mzhartley.service.demography;

import za.ac.cput.mzhartley.domain.demography.Gender;
import za.ac.cput.mzhartley.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
