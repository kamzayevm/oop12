package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum TeacherRank {
    TUTOR, SENIOR_LECTURER, PROFESSOR;

    private static final Map<String, TeacherRank> rankMap = new HashMap<>();

    static {
        for (TeacherRank rank : TeacherRank.values()) {
            rankMap.put(rank.name().toLowerCase().replace("_", ""), rank);
        }
    }

    public static TeacherRank of(String rank) {
        return rankMap.getOrDefault(rank.toLowerCase().replace("_", ""), null);
    }
}
