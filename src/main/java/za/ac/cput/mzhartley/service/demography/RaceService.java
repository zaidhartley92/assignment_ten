package za.ac.cput.mzhartley.service.demography;

import za.ac.cput.mzhartley.domain.demography.Race;
import za.ac.cput.mzhartley.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}
