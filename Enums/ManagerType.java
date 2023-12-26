package src.Enums;

public enum ManagerType {
    OR, DEPARTMENT;

    public static ManagerType of(String managerType) {
        try {
            return ManagerType.valueOf(managerType.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null;
        }
    }
}
