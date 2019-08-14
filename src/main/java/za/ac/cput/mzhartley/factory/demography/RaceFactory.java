package za.ac.cput.mzhartley.factory.demography;

import za.ac.cput.mzhartley.domain.demography.Race;
import za.ac.cput.mzhartley.util.Misc;

public class RaceFactory {

    public static Race buildRace(String raceName) {
        return new Race.Builder()
                .raceId(Misc.generateID())
                .raceName(raceName)
                .build();
    }
}