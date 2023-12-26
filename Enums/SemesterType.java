package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum SemesterType {
    FALL, SPRING, SUMMER;

    private static final Map<String, SemesterType> semesterMap = new HashMap<>();

    static {
        for (SemesterType semester : SemesterType.values()) {
            semesterMap.put(semester.name().toLowerCase(), semester);
        }
    }

    public static SemesterType of(String semester) {
        return semesterMap.getOrDefault(semester.toLowerCase(), null);
    }
}
