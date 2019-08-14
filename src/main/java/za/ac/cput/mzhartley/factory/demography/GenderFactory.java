package za.ac.cput.mzhartley.factory.demography;

import za.ac.cput.mzhartley.domain.demography.Gender;
import za.ac.cput.mzhartley.util.Misc;

public class GenderFactory {

    public static Gender buildGender(String genderName)
    {
        return new Gender.Builder()
                .genderId(Misc.generateID())
                .genderName(genderName)
                .build();
    }


}
