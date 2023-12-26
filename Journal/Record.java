package src.Journal;

import src.Enums.Attendance;

import java.io.Serializable;

public class Record implements Serializable {
    private Attendance attendance;
    private double grade;

    public Record() {
        
        this.attendance = Attendance.ABSENT;
        this.grade = 0.0;
    }

    
    public boolean getAttendance() {
        return attendance == Attendance.ATTENDED;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
