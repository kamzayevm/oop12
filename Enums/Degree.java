package src.Enums;

public enum Degree {
    PHD, MASTER, BACHELOR;

    public static Degree of(String degree) {
        try {
            return Degree.valueOf(degree.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null;
        }
    }
}
