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

    public String toString() {
        switch (this) {
            case PHD:
                return "PhD";
            case MASTER:
                return "Master";
            case BACHELOR:
                return "Bachelor";
            default:
                return "";
        }
    }
}
