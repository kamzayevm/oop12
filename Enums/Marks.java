package src.Enums;

public enum Marks {
    A, MINUS_A, PLUS_B, B, MINUS_B, PLUS_C, C, MINUS_C, PLUS_D, D, F;

    public static Marks of(String mark) {
        switch (mark.toLowerCase()) {
            case "a":
                return A;
            case "a-":
                return MINUS_A;
            case "b+":
                return PLUS_B;
            case "b":
                return B;
            case "b-":
                return MINUS_B;
            case "c+":
                return PLUS_C;
            case "c":
                return C;
            case "c-":
                return MINUS_C;
            case "d+":
                return PLUS_D;
            case "d":
                return D;
            case "f":
                return F;
            default:
                return null;
        }
    }
}
