package za.ac.cput.mzhartley.repository.demography;

import za.ac.cput.mzhartley.domain.demography.Gender;
import za.ac.cput.mzhartley.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {

    Set<Gender> getAll();
}
