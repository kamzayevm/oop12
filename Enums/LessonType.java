package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum LessonType {
    LECTURE, PRACTICE, LAB;

    private static final Map<String, LessonType> lessonTypeMap = new HashMap<>();

    static {
        for (LessonType lessonType : LessonType.values()) {
            lessonTypeMap.put(lessonType.name().toLowerCase(), lessonType);
        }
    }

    public static LessonType of(String lessonType) {
        return lessonTypeMap.getOrDefault(lessonType.toLowerCase(), null);
    }
}
