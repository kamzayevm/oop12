package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum UserR {
    ADMIN, MANAGER, TECH_SUPPORT, TEACHER, STUDENT, RESEARCHER;

    private static final Map<String, UserR> userMap = new HashMap<>();

    static {
        for (UserR user : UserR.values()) {
            userMap.put(user.name().toLowerCase(), user);
        }
    }

    public static UserR of(String userRole) {
        return userMap.getOrDefault(userRole.toLowerCase(), null);
    }
}
