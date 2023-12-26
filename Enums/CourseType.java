package src.Enums;

public enum CourseType {
    ELECTIVE, MAJOR, MINOR;

    public static CourseType of(String courseType) {
        try {
            return CourseType.valueOf(courseType.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null;
        }
    }
}
