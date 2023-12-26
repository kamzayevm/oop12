package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum Attendance {
    MISS, ATTENDED, ABSENT;

    private static final Map<String, Attendance> attendanceMap = new HashMap<>();

    static {
        attendanceMap.put("attended", ATTENDED);
        attendanceMap.put("absent", ABSENT);
    }

    public static Attendance of(String attendance) {
        return attendanceMap.getOrDefault(attendance, null);
    }
}

