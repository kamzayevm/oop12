package src.Enums;

import java.time.DayOfWeek;

public enum DayOfWeek {
    MONDAY(java.time.DayOfWeek.MONDAY),
    TUESDAY(java.time.DayOfWeek.TUESDAY),
    WEDNESDAY(java.time.DayOfWeek.WEDNESDAY),
    THURSDAY(java.time.DayOfWeek.THURSDAY),
    FRIDAY(java.time.DayOfWeek.FRIDAY),
    SATURDAY(java.time.DayOfWeek.SATURDAY),
    SUNDAY(java.time.DayOfWeek.SUNDAY);

    private final java.time.DayOfWeek dayOfWeek;

    DayOfWeek(java.time.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public java.time.DayOfWeek toJavaTimeDay() {
        return dayOfWeek;
    }
}
