package za.ac.cput.mzhartley.util;

import java.util.UUID;

public class Misc {

    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}