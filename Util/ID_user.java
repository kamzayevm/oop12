package src.Util;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ID_User implements Serializable {
    private static final String PRIVATE_IDENTIFIER = "B";
    private static final int RANDOM_NUMBER_LENGTH = 6;
    private static final Set<String> usedIDs = new HashSet<>();

    public String generateUniqueID() {
        String generatedID;

        do {
            generatedID = generateID();
        } while (!isUnique(generatedID));

        usedIDs.add(generatedID);
        return generatedID;
    }

    private boolean isUnique(String id) {
        return !usedIDs.contains(id);
    }

    private String generateID() {
        int year = LocalDate.now().getYear() % 100;
        String randomNumber = generateRandomNumber();
        return String.format("%02d%s%s", year, PRIVATE_IDENTIFIER, randomNumber);
    }

    private String generateRandomNumber() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < RANDOM_NUMBER_LENGTH; i++) {
            stringBuilder.append(random.nextInt(10));
        }

        return stringBuilder.toString();
    }
}
