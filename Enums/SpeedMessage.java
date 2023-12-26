package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum SpeedMessage {
    LOW, MEDIUM, HIGH;

    private static final Map<String, SpeedMessage> speedMessageMap = new HashMap<>();

    static {
        for (SpeedMessage speedMessage : SpeedMessage.values()) {
            speedMessageMap.put(speedMessage.name().toLowerCase(), speedMessage);
        }
    }

    public static SpeedMessage of(String speed) {
        return speedMessageMap.getOrDefault(speed.toLowerCase(), null);
    }
}
