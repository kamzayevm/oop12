package src.Enums;

import java.util.HashMap;
import java.util.Map;

public enum Languages {
    KZ, RU, EN;

    private static final Map<String, Languages> languageMap = new HashMap<>();

    static {
        for (Languages language : Languages.values()) {
            languageMap.put(language.name().toLowerCase(), language);
        }
    }

    public static Languages of(String language) {
        return languageMap.get(language.toLowerCase());
    }
}
