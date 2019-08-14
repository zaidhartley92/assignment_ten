package za.ac.cput.mzhartley.repository.demography;

import za.ac.cput.mzhartley.domain.demography.Race;
import za.ac.cput.mzhartley.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {

    Set<Race> getAll();
}
