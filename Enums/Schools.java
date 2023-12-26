package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum Schools {
    SITE, ISE, BS, OTHER;

    private static final Map<String, Schools> schoolMap = new HashMap<>();

    static {
        for (Schools school : Schools.values()) {
            schoolMap.put(school.name().toLowerCase(), school);
        }
    }

    public static Schools of(String school) {
        return schoolMap.getOrDefault(school.toLowerCase(), null);
    }
}
